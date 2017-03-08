package edu.jalc.shape;

abstract public class TwoDimensionalShape{
   
   abstract public double getPerimeter();
   abstract public double getArea();
   abstract public String toString();
   
   public boolean equals(TwoDimensionalShape shape){
     return (Math.abs(shape.getArea()- this.getArea()) < this.getArea()/1000000);
   } // returns true if the parameter shape is within 0.0001% of this one.
   
   public Square toSquare(){
      double sideLength = Math.sqrt(this.getArea());
      return new Square(sideLength);
   }
   public Circle toCircle(){
      double radius = Math.sqrt(this.getArea()/Math.PI);
      return new Circle(radius);
   }
}
