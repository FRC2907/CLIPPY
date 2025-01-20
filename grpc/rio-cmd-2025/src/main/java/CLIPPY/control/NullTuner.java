package CLIPPY.control;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class NullTuner extends WippyTuner {

    public NullTuner(MotorController m, String id, String ...tags) {
        this(id, tags);
    }
    public NullTuner(String id, String ...tags) {
        super(id, tags);
        CommandScheduler.getInstance().registerSubsystem(this);
    }

    @Override
    public SystemState buildSystemState() {
        return SystemState.newBuilder().build();
    }

    @Override
    public void setVoltage(double voltage) { }

    @Override
    public double getPosition() { return 0; }

    @Override
    public double getVelocity() { return 0; }

}
