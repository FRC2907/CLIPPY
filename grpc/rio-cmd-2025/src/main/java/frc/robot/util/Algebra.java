package frc.robot.util;

import static edu.wpi.first.units.Units.Value;

import java.util.Arrays;

import edu.wpi.first.units.Measure;
import edu.wpi.first.units.Unit;

public class Algebra {
    /**
     * Return an array where all elements are scaled such that the largest magnitude
     * is 1.
     */
    public static double[] normalizeAndScale(double... values) {
        if (values.length == 0) return new double[]{};
        if (values.length == 1) {
            if (values[0] == 0) return new double[]{0};
            else return new double[]{Math.signum(values[0])};
        }
        double biggliest = Arrays.stream(values).map(Math::abs).max().getAsDouble();
        return Arrays.stream(values).map(d -> d/biggliest).toArray();
    }
    /**
     * Return an array where all elements are scaled such that no element's
     * magnitude is greater than 1. This is equivalent to normalizeAndScale except
     * when all magnitudes are already <= 1, in which case the a copy of the list is
     * returned.
     */
    public static double[] normalizeWithoutScale(double... values) {
        if (values.length == 0) return new double[]{};
        if (values.length == 1) {
            if (values[0] == 0) return new double[]{0};
            else if (Math.abs(values[0]) > 1) return new double[]{Math.signum(values[0])};
            else return new double[]{values[0]};
        }
        double biggliest = Arrays.stream(values).map(Math::abs).max().getAsDouble();
        if (biggliest > 1) return Arrays.stream(values).map(d -> d/biggliest).toArray();
        else return Arrays.copyOf(values, values.length);
    }

    public static double[] normalizeToCircle(double x, double y) {
        return new double[]{x / Math.hypot(x, y), y / Math.hypot(x, y)};
    }

    public static double rpmToDps(double rpm, double diameter) {
        return rpm * 60 * Math.PI * diameter;
    }

    /**
     * Panic if the napkin-math isn't within 10% of the calculated value.
     */
    public static void sanityCheck(double napkin, double calc) {
        sanityCheck(Value.of(napkin), Value.of(calc));
    }
    public static <T extends Unit> void sanityCheck(Measure<T> napkin, Measure<T> calc) {
        if (calc.times(0.9).gt(napkin) || calc.times(1.1).lt(napkin))
        throw new IllegalStateException("Napkin says " + napkin + ", math says " + calc);
    }
}
