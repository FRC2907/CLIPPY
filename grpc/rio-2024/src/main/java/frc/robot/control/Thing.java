package frc.robot.control;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Thing {//implements IGenericPIDController {

    private CANSparkMax m;

    public Thing(int id) {
        this.m = new CANSparkMax(id, MotorType.kBrushless);
    }

    //@Override
    //public void setP(double kP) {
    //    m.getPIDController().setP(kP);
    //}

    //@Override
    //public void setI(double kI) {
    //    m.getPIDController().setI(kI);
    //}

    //@Override
    //public void setD(double kD) {
    //    m.getPIDController().setD(kD);
    //}

    //@Override
    //public void setF_static(double kF_static) {
    //}

    //@Override
    //public void setF_linear(double kF_linear) {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setF_linear'");
    //}

    //@Override
    //public void setF_linear_per_time(double kF_square) {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setF_square'");
    //}

    //@Override
    //public void setF_constant(double kF_constant) {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setF_constant'");
    //}

    //@Override
    //public void setF_cosine(double kF_cosine) {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setF_cosine'");
    //}

    //@Override
    //public void setU(double kU) {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setU'");
    //}

    //@Override
    //public void setPidFromU() {
    //    // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'setPidFromU'");
    //}
}