package CLIPPY.control;

import com.revrobotics.spark.SparkMax;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class SmaxTuner extends WippyTuner {

    private final SparkMax m;

    public SmaxTuner(SparkMax m, String id, String ...tags) {
        super(id, tags);
        this.m = m;
        CommandScheduler.getInstance().registerSubsystem(this);
    }

    @Override
    public SystemState buildSystemState() {
        SystemState out = super.buildSystemState();

        //double simVoltage = 12*Math.random();
        //double simVelocity = (5600/12d) * simVoltage + (100*Math.random() - 50);
        Measurement x = Measurement.newBuilder()
            .setPosition(m.getEncoder().getPosition())
            .setVelocity(m.getEncoder().getVelocity())
            .setVoltage(m.getAppliedOutput() * m.getBusVoltage())
            .setCurrent(m.getOutputCurrent())
            .setTemperature(m.getMotorTemperature())

            // remove before flight
            //.setVelocity(simVelocity)
            //.setVoltage(simVoltage)
            

            .build();
        return out.toBuilder()
            .setState(x)
            .build();
    }

    @Override
    public void setVoltage(double voltage) {
        m.setVoltage(voltage);
    }

    @Override
    public double getPosition() {
        return m.getEncoder().getPosition();
    }

    @Override
    public double getVelocity() {
        return m.getEncoder().getVelocity();
    }

}
