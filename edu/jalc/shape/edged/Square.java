package edu.jalc.shape.edged;

import edu.jalc.shape.TwoDimensionalShape;

public class Square extends Rectangle{

  public Square(double side){
     super(side,side);
  }

  public static Square toSquare(TwoDimensionalShape shape){
    return new Square(Math.sqrt(shape.area()));
  }

  public String toString(){
    return "square of area " + area();
  }
}
