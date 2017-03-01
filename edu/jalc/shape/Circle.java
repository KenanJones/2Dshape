package edu.jalc.shape;

public class Circle extends Ellipse{

  private Circle(){super(0,0);}

   public Circle(double radius){
     super(radius,radius);
   }

   public String toString(){
     return "circle of area " + getArea();
   }
}
