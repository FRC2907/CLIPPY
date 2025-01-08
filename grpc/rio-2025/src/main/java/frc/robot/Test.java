package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.constants.Settings;
import frc.robot.flow.Util;

public class Test extends TimedRobot {
  public Test() {
    super(Settings.MAIN_LOOP_TIME);
  }

  @Override
  public void robotInit() {
    Util.perish();
  }

}
