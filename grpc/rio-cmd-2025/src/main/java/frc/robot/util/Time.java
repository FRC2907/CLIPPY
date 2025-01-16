package frc.robot.util;

import com.google.protobuf.Timestamp;

import edu.wpi.first.wpilibj.Timer;

public class Time {

    public static double now() {
        return Timer.getFPGATimestamp();
    }

    public static Timestamp nowTimestamp() {
        double now = Timer.getFPGATimestamp();
        int seconds = (int)Math.floor( now );
        int nanos   = (int)Math.floor((now - seconds) * 1e9);
        return Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
    }

    public static double timeFromTimestamp(Timestamp ts) {
        return (double)(ts.getSeconds()) + ((double)(ts.getNanos()) * 1e-9);
    }
    
}
