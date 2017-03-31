package edu.jalc.shape.edged;

abstract public class Triangle extends EdgedShape{

   public Triangle(double h, double w){
     super(h,w);
   }

   public double area(){
     return 0.5 * super.getHeight() * super.getWidth();
   }

   public String toString(){
     return "triangle of area " + area();
   }
}
