package edu.jalc.shape;

public class Ellipse extends TwoDimensionalShape{

   private double majorAxis;
   private double minorAxis;

   private Ellipse(){
     this.majorAxis = this.minorAxis = 0;
   }

   public Ellipse(double axis1, double axis2){
     majorAxis = axis1>axis2?axis1:axis2;
     minorAxis = axis1>axis2?axis2:axis1;
   }

   public double getPerimeter(){
     return 2*Math.PI * Math.sqrt ((majorAxis*majorAxis + minorAxis*minorAxis)/2);
   }

   public double getArea(){
     return Math.PI * majorAxis * minorAxis;
   }

   public String toString(){
     return "ellipse of area " + getArea();
   }
}
