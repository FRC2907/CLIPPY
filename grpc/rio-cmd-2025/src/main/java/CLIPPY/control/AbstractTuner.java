package CLIPPY.control;

import java.util.Set;

import CLIPPY.control.ControlGainsOuterClass.ZNControlRule;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import frc.robot.util.Time;

public abstract class AbstractTuner implements ITunableSystem {
    protected final String id;
    protected final Set<String> tags;

    public AbstractTuner(String id, String... tags) {
        this.id = id;
        this.tags = Set.of(tags);
        Registry.getInstance().systems.put(id, this);
        Registry.getInstance().systemTags.addAll(this.tags);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public Set<String> getIDTags() {
        return tags;
    }

    @Override
    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }

    @Override
    public AbstractTuner zieglify(double Ku, double Tu, ZNControlRule style) {
        double kKp = 0, kTi = 0, kTd = 0;
        switch (style) {
            case P:
                kKp = 1/2d;
                kTi = 0;
                kTd = 0;
                break;
            case PI:
                kKp = 9/20d;
                kTi = 5/6d;
                kTd = 0;
                break;
            case PD:
                kKp = 4/5d;
                kTi = 0;
                kTd = 1/8d;
                break;
            case PID:
                kKp = 3/5d;
                kTi = 1/2d;
                kTd = 1/8d;
                break;
            case PESSEN:
                kKp = 7/10d;
                kTi = 2/5d;
                kTd = 3/20d;
                break;
            case MILD_OVERSHOOT:
                kKp = 1/3d;
                kTi = 1/2d;
                kTd = 1/3d;
                break;
            case NO_OVERSHOOT:
                kKp = 1/5d;
                kTi = 1/2d;
                kTd = 1/3d;
                break;
            // Add custom rule implementations here. Add case names to ControlGains.proto
            default:
                System.err.print("[warn] Attempted to set kU = " + Ku + " and tU = " + Tu + ", but either no Ziegler-Nichols control rule was specified, or it was specified as UNSET. Ignoring request.");
                return this;
        }
        double Kp = kKp * Ku;
        double Ti = kTi * Tu;
        double Td = kTd * Tu;
        setP(Kp);
        setI(Kp / Ti);
        setD(Kp * Td);
        return this;
    }

    @Override
    public SystemState buildSystemState() {
        return SystemState.newBuilder()
            .setTimestamp(Time.nowTimestamp())
            .setSystemId(id)
            .build();
    }
}
