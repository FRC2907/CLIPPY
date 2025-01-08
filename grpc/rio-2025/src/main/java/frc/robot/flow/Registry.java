package frc.robot.flow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.wpi.first.math.Pair;
import frc.robot.control.ISystem;

public class Registry {
    public final Map<String, ISystem> systems = new HashMap<>();
    public final List<ILooper> loopers = new ArrayList<>();
    public final List<Pair<Double, Voidinator>> delayedControlTargets = new ArrayList<>();

    // Singleton
    private Registry() {}
    private static Registry instance;
    public static Registry getInstance() {
        if (instance == null)
            instance = new Registry();
        return instance;
    }
}
