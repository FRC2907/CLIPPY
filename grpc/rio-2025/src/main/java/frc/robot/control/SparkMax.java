package frc.robot.control;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;

public class SparkMax extends PIDFMotorController {
    com.revrobotics.spark.SparkMax m;
    public SparkMax(String name, com.revrobotics.spark.SparkMax m) {
        super(name, m, m.getEncoder()::getVelocity);
        this.m = m;
    }

    @Override
    public SystemState buildSystemState() {
        SystemState out = super.buildSystemState();
        Measurement x = out.getState().toBuilder()
            .setPosition(m.getEncoder().getPosition())
            .setVelocity(m.getEncoder().getVelocity())
            .setVoltage(m.getAppliedOutput() * m.getBusVoltage())
            .setCurrent(m.getOutputCurrent())
            .build();
        return out.toBuilder()
            .setState(x)
            .build();
    }

}
