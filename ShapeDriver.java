import edu.jalc.shape.*;

public class ShapeDriver{
  public static void main(String... args){
    TwoDimensionalShape[] shapes = new TwoDimensionalShape[10];
    shapes[0] = new Circle(10);
    shapes[1] = new Ellipse(10,10);
    shapes[2] = new Rectangle(24,1.5);
    shapes[3] = new Square(6);
    shapes[4] = new Triangle(10,11,12);
    shapes[5] = new RightTriangle(3,4);
    shapes[6] = shapes[0].toSquare();
    shapes[7] = shapes[5].toSquare();
    shapes[8] = shapes[3].toCircle();
    shapes[9] = shapes[5].toCircle();
    System.out.println(shapes[0].equals(shapes[2]));
    System.out.println(shapes[0].equals(shapes[1]));
    System.out.println(shapes[2].equals(shapes[3]));
    for(int i = 0; i < shapes.length; i++){
      System.out.println(shapes[i].toString());
    }
    System.out.println(shapes[0].equals(shapes[6]));
    System.out.println(shapes[5].equals(shapes[7]));
    System.out.println(shapes[3].equals(shapes[8]));
    System.out.println(shapes[5].equals(shapes[9]));
  }
}
