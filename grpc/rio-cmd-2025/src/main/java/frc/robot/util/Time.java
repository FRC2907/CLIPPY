package frc.robot.util;

import com.google.protobuf.Timestamp;

import edu.wpi.first.wpilibj.Timer;

public class Time {

    public static double now() {
        return Timer.getFPGATimestamp();
    }

    public static Timestamp nowTimestamp() {
        return timestampFromTime(Timer.getFPGATimestamp());
    }

    public static double timeFromTimestamp(Timestamp ts) {
        return (double)(ts.getSeconds()) + ((double)(ts.getNanos()) * 1e-9);
    }

    public static Timestamp timestampFromTime(double ts) {
        int seconds = (int)Math.floor( ts );
        int nanos   = (int)Math.floor((ts - seconds) * 1e9);
        return Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
    }
    
}
