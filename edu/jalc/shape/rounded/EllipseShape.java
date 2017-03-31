package edu.jalc.shape.rounded;

import edu.jalc.shape.TwoDimensionalShape;

abstract public class EllipseShape extends TwoDimensionalShape{
  private double majorAxis, minorAxis;

  public EllipseShape(double majorAxis, double minorAxis){
    this.majorAxis = majorAxis;
    this.minorAxis = minorAxis;
  }

  abstract public double circumfrence();

  public final double area(){
    return Math.PI * majorAxis * minorAxis;
  }

  public double getMajorAxis(){
    return this.majorAxis;
  }
  public double getMinorAxis(){
    return this.minorAxis;
  }
  public void setMajorAxis(double length){
    this.majorAxis = length;
  }
  public void setMinorAxis(double length){
    this.minorAxis = length;
  }
}
