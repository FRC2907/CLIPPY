package CLIPPY.control;

import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemState.Measurement;
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
        SystemState out = super.buildSystemState();

        //double simVoltage = 12*Math.random();
        //double simVelocity = (5600/12d) * simVoltage + (100*Math.random() - 50);
        Measurement x = Measurement.newBuilder()

            // remove before flight
            //.setVelocity(simVelocity)
            //.setVoltage(simVoltage)
            

            .build();
        return out.toBuilder()
            .setState(x)
            .build();
    }

    @Override
    public void setVoltage(double voltage) { }

    @Override
    public double getPosition() { return 0; }

    @Override
    public double getVelocity() { return 0; }

}
