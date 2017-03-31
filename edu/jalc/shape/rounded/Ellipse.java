package edu.jalc.shape.rounded;

public class Ellipse extends EllipseShape{

   public Ellipse(double axis1, double axis2){
    super(axis1,axis2);
   }

   public double circumfrence(){
     return 2*Math.PI * Math.sqrt (Math.pow(super.getMajorAxis(),2) + Math.pow(super.getMinorAxis(),2));
   }

   public String toString(){
     return "ellipse of area " + area();
   }
}
