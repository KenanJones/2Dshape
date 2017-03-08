package edu.jalc.shape;

public class RightTriangle extends Triangle{

   private double a;
   private double b;

   private RightTriangle(){
     super(0,0,0);
   }

   public RightTriangle(double a, double b){
     super(a,b,Math.hypot(a,b));
   }

   public String toString(){
     return "right triangle of area " + getArea();
   }
}