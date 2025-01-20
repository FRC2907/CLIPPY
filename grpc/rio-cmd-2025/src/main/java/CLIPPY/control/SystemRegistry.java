package CLIPPY.control;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SystemRegistry {
    public final Map<String, ITunableSystem> systems = new HashMap<>();
    public final Set<String> systemTags = new HashSet<>();

    // Singleton
    private SystemRegistry() {}
    private static SystemRegistry instance;
    public static SystemRegistry getInstance() {
        if (instance == null)
            instance = new SystemRegistry();
        return instance;
    }

    public void register(ITunableSystem sys) {
        systems.put(sys.getID(), sys);
        systemTags.addAll(sys.getIDTags());
    }
}
