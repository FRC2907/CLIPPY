package CLIPPY.control;
import com.revrobotics.spark.SparkMax;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;

public class SmaxTuner extends WippyTuner {

    private final SparkMax m;

    public SmaxTuner(SparkMax m, String id, String ...tags) {
        super(id, tags);
        this.m = m;
    }

    @Override
    public SystemState buildSystemState() {
        SystemState out = super.buildSystemState();

        double simVoltage = 12*Math.random();
        double simVelocity = (5600/12d) * simVoltage + (100*Math.random() - 50);
        Measurement x = Measurement.newBuilder()
            .setPosition(m.getEncoder().getPosition())
            .setVelocity(m.getEncoder().getVelocity())
            .setVoltage(m.getAppliedOutput() * m.getBusVoltage())
            .setCurrent(m.getOutputCurrent())
            .setTemperature(m.getMotorTemperature())

            // remove before flight
            .setVelocity(simVelocity)
            .setVoltage(simVoltage)
            

            .build();
        return out.toBuilder()
            .setState(x)
            .build();
    }

}
