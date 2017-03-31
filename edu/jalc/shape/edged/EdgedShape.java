package edu.jalc.shape.edged;

import edu.jalc.shape.TwoDimensionalShape;

abstract public class EdgedShape extends TwoDimensionalShape{
  private double width, height;

  public EdgedShape(double height, double width){
    this.height = height;
    this.width = width;
  }

  abstract double perimeter();

  public double getHeight(){
    return this.height;
  }
  public double getWidth(){
    return this.width;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWidth(double width){
    this.width = width;
  }
}
