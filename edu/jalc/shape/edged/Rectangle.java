package edu.jalc.shape.edged;

public class Rectangle extends EdgedShape{

   public Rectangle(double height, double width){
     super(height,width);
   }

   public double perimeter(){
     return 2*super.getHeight() + 2*super.getWidth();
   }
   public double area(){
     return super.getHeight() * super.getWidth();
   }

   public String toString(){
     return "rectangle of area " + area();
   }
}
