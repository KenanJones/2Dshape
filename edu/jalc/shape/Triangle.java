package edu.jalc.shape;

public class Triangle extends Polygon{

   private double a, b, c;

   private Triangle(){
     this.a = this.b = this.c = 0;
   }

   public Triangle(double a, double b, double c){
     this.a = a;
     this.b = b;
     this.c = c;
   }

   public double getPerimeter(){
     return a + b + c;
   }
   public double getArea(){
     double s = 0.5*getPerimeter();
     return Math.sqrt(s*(s-a)*(s-b)*(s-c));//Heron's formula
   }

   public String toString(){
     return "triangle of area " + getArea();
   }
}
