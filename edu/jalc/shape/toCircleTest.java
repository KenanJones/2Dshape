package edu.jalc.shape;

public class ToCircleTest{
  public static void main(String... args){
    Square square = new Square(10);
    Circle circle = square.toCircle();
    assert(square.equals(circle));
    System.out.println("all tests passed");
  }
}
