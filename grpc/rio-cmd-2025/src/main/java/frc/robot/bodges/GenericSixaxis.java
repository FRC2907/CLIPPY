package frc.robot.bodges;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.StadiaController;

public class GenericSixaxis {
    private enum Type { PS4, PS5, XBOX, STADIA };
    private final Type type;
    private final PS4Controller ps4;
    private final PS5Controller ps5;
    private final XboxController xbox;
    private final StadiaController stadia;
    @SuppressWarnings("unused")
    private GenericSixaxis() {
        this.type = null;
        this.ps4 = null;
        this.ps5 = null;
        this.xbox = null;
        this.stadia = null;
    }
    public GenericSixaxis(PS4Controller ctlr) {
        this.type = Type.PS4;
        this.ps4 = ctlr;
        this.ps5 = null;
        this.xbox = null;
        this.stadia = null;
    }
    public GenericSixaxis(PS5Controller ctlr) {
        this.type = Type.PS5;
        this.ps4 = null;
        this.ps5 = ctlr;
        this.xbox = null;
        this.stadia = null;
    }
    public GenericSixaxis(XboxController ctlr) {
        this.type = Type.XBOX;
        this.ps4 = null;
        this.ps5 = null;
        this.xbox = ctlr;
        this.stadia = null;
    }
    public GenericSixaxis(StadiaController ctlr) {
        this.type = Type.PS4;
        this.ps4 = null;
        this.ps5 = null;
        this.xbox = null;
        this.stadia = ctlr;
    }

    // apparently everything is *scribbled out* not great
    // https://docs.wpilib.org/en/stable/docs/software/basic-programming/coordinate-system.html
    // here we will use west-north, which aligns with a regular cartesian coordinate grid superimposed on each joystick
    public double getLeftX() {
        switch (type) {
            case PS4:    return ps4   .getLeftY();
            case PS5:    return ps5   .getLeftY();
            case XBOX:   return xbox  .getLeftY();
            case STADIA: return stadia.getLeftY();
            default:     return 0;
        }
    }

    public double getRightX() {
        switch (type) {
            case PS4:    return ps4   .getRightY();
            case PS5:    return ps5   .getRightY();
            case XBOX:   return xbox  .getRightY();
            case STADIA: return stadia.getRightY();
            default:     return 0;
        }
    }

    public double getLeftY() {
        switch (type) {
            case PS4:    return ps4   .getLeftX();
            case PS5:    return ps5   .getLeftX();
            case XBOX:   return xbox  .getLeftX();
            case STADIA: return stadia.getLeftX();
            default:     return 0;
        }
    }

    public double getRightY() {
        switch (type) {
            case PS4:    return ps4   .getRightX();
            case PS5:    return ps5   .getRightX();
            case XBOX:   return xbox  .getRightX();
            case STADIA: return stadia.getRightX();
            default:     return 0;
        }
    }

    public double getL2Axis() {
        switch (type) {
            case PS4:    return ps4   .getL2Axis();
            case PS5:    return ps5   .getL2Axis();
            case XBOX:   return xbox  .getLeftTriggerAxis();
            case STADIA: return 0;
            default:     return 0;
        }
    }

    public double getR2Axis() {
        switch (type) {
            case PS4:    return ps4   .getR2Axis();
            case PS5:    return ps5   .getR2Axis();
            case XBOX:   return xbox  .getRightTriggerAxis();
            case STADIA: return 0;
            default:     return 0;
        }
    }

}
