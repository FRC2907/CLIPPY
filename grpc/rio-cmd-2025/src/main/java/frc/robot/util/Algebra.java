package frc.robot.util;

import java.util.Arrays;

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
}
