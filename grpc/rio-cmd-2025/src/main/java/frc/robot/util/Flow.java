package frc.robot.util;

public class Flow {
    /** Stop execution immediately via null pointer exception. */
    @SuppressWarnings("null")
    public static void perish() {
        Integer x = null;
        x = x + 1;
    }
}
