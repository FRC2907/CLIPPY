package frc.robot.flow;

public class Watchdog implements ILooper {

    public Watchdog() { Registry.getInstance().loopers.add(this); }

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
