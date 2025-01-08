package frc.robot.util;

import com.google.protobuf.Timestamp;

import edu.wpi.first.wpilibj.Timer;

public class Protos {

    public static Timestamp now() {
        double now = Timer.getFPGATimestamp();
        int seconds = (int)Math.floor( now );
        int nanos   = (int)Math.floor((now - seconds) * 1e9);
        return Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
    }
    
}
