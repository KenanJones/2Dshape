package edu.jalc.shape;

abstract public class TwoDimensionalShape{

   abstract public double area();

   public boolean equals(TwoDimensionalShape shape){
     return (Math.abs(shape.area()- this.area()) < this.area()/1000000);
   } // returns true if the parameter shape is within 0.0001% of this one.

   /*public Square toSquare(){
      double sideLength = Math.sqrt(this.getArea());
      return new Square(sideLength);
   }
   public Circle toCircle(){
      double radius = Math.sqrt(this.getArea()/Math.PI);
      return new Circle(radius);
   }*/
}
