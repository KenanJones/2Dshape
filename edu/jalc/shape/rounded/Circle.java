package edu.jalc.shape.rounded;

import edu.jalc.shape.TwoDimensionalShape;

public class Circle extends Ellipse{

   public Circle(double radius){
     super(radius,radius);
   }

   public static Circle toCircle(TwoDimensionalShape shape){
     return new Circle(Math.sqrt(shape.area()/Math.PI));
   }

   public String toString(){
     return "circle of area " + area();
   }
}
