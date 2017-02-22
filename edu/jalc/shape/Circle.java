package edu.jalc.shape;

class Circle extends Ellipse{
   
   private double majorAxis;
   private double minorAxis;
   
   public double getPerimeter(){
   return 2*Math.PI * Math.sqrt ((majorAxis*majorAxis + minorAxis*minorAxis)/2);
   }
   public double getArea(){
   return 1;
   }
}