package frc.robot.util;

public class Util {
    /** Stop execution immediately via null pointer exception. */
    @SuppressWarnings("null")
    public static void perish() {
        Integer x = null;
        x = x + 1;
    }
}
