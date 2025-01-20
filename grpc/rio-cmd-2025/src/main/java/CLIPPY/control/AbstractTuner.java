package CLIPPY.control;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Subsystem;

public abstract class AbstractTuner implements ITunableSystem, Subsystem {
    protected final String id;
    protected final Set<String> tags;

    public AbstractTuner(String id, String... tags) {
        this.id = id;
        this.tags = Set.of(tags);
        SystemRegistry.getInstance().register(this);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public Set<String> getIDTags() {
        return tags;
    }

}
