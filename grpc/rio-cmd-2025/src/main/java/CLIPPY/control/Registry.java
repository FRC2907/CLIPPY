package CLIPPY.control;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
