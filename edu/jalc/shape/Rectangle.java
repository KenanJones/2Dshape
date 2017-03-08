package edu.jalc.shape;

public class Rectangle extends Polygon{

   private double height;
   private double width;

   private Rectangle(){
     this.height = this.width = 0;
   }

   public Rectangle(double height, double width){
     this.height = height;
     this.width = width;
   }

   public double getPerimeter(){
     return 2*height + 2*width;
   }
   public double getArea(){
     return height * width;
   }

   public String toString(){
     return "rectangle of area " + getArea();
   }
}
