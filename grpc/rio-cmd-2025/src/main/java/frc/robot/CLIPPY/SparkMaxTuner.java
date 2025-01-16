package frc.robot.CLIPPY;

import com.google.protobuf.DoubleValue;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.config.ClosedLoopConfig;
import com.revrobotics.spark.config.SparkMaxConfig;

import CLIPPY.control.ControlGainsOuterClass.ControlGains;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;

public class SparkMaxTuner extends AbstractTuner {

    private final SparkMax m;
    private class Cache {
        double kP = 0, kI = 0, kD = 0, kF = 0;
    }
    private Cache cache;

    public SparkMaxTuner(SparkMax m, String id, String... tags) {
        super(id, tags);
        this.m = m;
        this.cache = new Cache();
        this.cache.kP = m.configAccessor.closedLoop.getP();
        this.cache.kI = m.configAccessor.closedLoop.getI();
        this.cache.kD = m.configAccessor.closedLoop.getD();
        this.cache.kF = m.configAccessor.closedLoop.getFF();
    }

    @Override
    public SparkMaxTuner setP(double kP) {
        m.configureAsync(new SparkMaxConfig().apply(new ClosedLoopConfig().p(kP)), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        cache.kP = kP;
        return this;
    }

    @Override
    public SparkMaxTuner setI(double kI) {
        m.configureAsync(new SparkMaxConfig().apply(new ClosedLoopConfig().i(kI)), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        cache.kI = kI;
        return this;
    }

    @Override
    public SparkMaxTuner setD(double kD) {
        m.configureAsync(new SparkMaxConfig().apply(new ClosedLoopConfig().d(kD)), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        cache.kD = kD;
        return this;
    }

    @Override
    public SparkMaxTuner setF_static(double kF_static) {
        System.err.println("[warn] Attempting to configure static feedforward on a SparkMaxTuner is not yet supported. Received kF_static = " + kF_static);
        return this;
    }

    @Override
    public SparkMaxTuner setF_linear(double kF_linear) {
        m.configureAsync(new SparkMaxConfig().apply(new ClosedLoopConfig().velocityFF(kF_linear)), ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
        cache.kF = kF_linear;
        return this;
    }

    @Override
    public SparkMaxTuner setF_linear_per_time(double kF_lpt) {
        System.err.println("[warn] Attempting to configure acceleration feedforward on a SparkMaxTuner is not yet supported. Received kF_lpt = " + kF_lpt);
        return this;
    }

    @Override
    public SparkMaxTuner setF_constant(double kF_constant) {
        System.err.println("[warn] Attempting to configure constant feedforward on a SparkMaxTuner is not yet supported. Received kF_constant = " + kF_constant);
        return this;
    }

    @Override
    public SystemState buildSystemState() {
        SystemState out = super.buildSystemState();
        Measurement x = Measurement.newBuilder()
            .setPosition(m.getEncoder().getPosition())
            .setVelocity(m.getEncoder().getVelocity())
            .setVoltage(m.getAppliedOutput() * m.getBusVoltage())
            .setCurrent(m.getOutputCurrent())
            .setTemperature(m.getMotorTemperature())
            .build();
        ControlGains k = ControlGains.newBuilder()
            // these methods are synchronous and should be called infrequently
            // according to the docs
            //.setKP(DoubleValue.of(m.configAccessor.closedLoop.getP()))
            //.setKI(DoubleValue.of(m.configAccessor.closedLoop.getI()))
            //.setKD(DoubleValue.of(m.configAccessor.closedLoop.getD()))
            //.setKFLinear(DoubleValue.of(m.configAccessor.closedLoop.getFF()))
            .setKP(DoubleValue.of(cache.kP))
            .setKI(DoubleValue.of(cache.kI))
            .setKD(DoubleValue.of(cache.kD))
            .setKFLinear(DoubleValue.of(cache.kF))
            .build();
        return out.toBuilder()
            .setState(x)
            .setGains(k)
            .build();
    }
}
