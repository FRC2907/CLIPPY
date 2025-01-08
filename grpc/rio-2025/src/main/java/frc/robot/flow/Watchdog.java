package frc.robot.flow;

public class Watchdog implements ILooper {

    @Override
    public ILooper init() {
        System.out.println("[watchdog]\tinit");
        return this;
    }

    @Override
    public ILooper loop() {
        System.out.println("[watchdog]\tloop");
        return this;
    }

    @Override
    public ILooper stop() {
        System.out.println("[watchdog]\tstop");
        return this;
    }
    
}
