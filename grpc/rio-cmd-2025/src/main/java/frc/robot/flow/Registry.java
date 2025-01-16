package frc.robot.flow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import frc.robot.CLIPPY.ITunableSystem;

public class Registry {
    public final Map<String, ITunableSystem> systems = new HashMap<>();
    public final Set<String> systemTags = new HashSet<>();

    // Singleton
    private Registry() {}
    private static Registry instance;
    public static Registry getInstance() {
        if (instance == null)
            instance = new Registry();
        return instance;
    }
}
