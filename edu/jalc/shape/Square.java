package edu.jalc.shape;

public class Square extends Rectangle{

  private Square(){super(0,0);}

  public Square(double side){
     super(side,side);
  }

  public String toString(){
    return "square of area " + getArea();
  }
}
