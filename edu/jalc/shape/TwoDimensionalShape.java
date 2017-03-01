package edu.jalc.shape;

abstract public class TwoDimensionalShape{
   abstract public double getPerimeter();
   abstract public double getArea();
   abstract public String toString();
   public boolean equals(TwoDimensionalShape shape){
     return (shape.getArea() == this.getArea());
   }
}
