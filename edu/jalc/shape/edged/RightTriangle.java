package edu.jalc.shape.edged;

public class RightTriangle extends Triangle{

   public RightTriangle(double h, double w){
     super(h,w);
   }

   public double perimeter(){
     return super.getHeight() + super.getWidth() + this.hypot();
   }

   public double hypot(){
     return Math.sqrt(Math.pow(super.getHeight(),2)+Math.pow(super.getWidth(),2));
   }

   public String toString(){
     return "right triangle of area " + area();
   }
}
