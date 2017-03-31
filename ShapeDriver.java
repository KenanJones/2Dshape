import edu.jalc.shape.TwoDimensionalShape;
import edu.jalc.shape.edged.*;
import edu.jalc.shape.rounded.*;

public class ShapeDriver{
  public static void main(String... args){
    TwoDimensionalShape[] shapes = new TwoDimensionalShape[10];
    shapes[0] = new Circle(10);
    shapes[1] = new Ellipse(10,10);
    shapes[2] = new Rectangle(24,1.5);
    shapes[3] = new Square(6);
    shapes[4] = new RightTriangle(6.3,2.2);
    shapes[5] = new RightTriangle(3,4);
    shapes[6] = Square.toSquare(shapes[0]);
    shapes[7] = Square.toSquare(shapes[5]);
    shapes[8] = Circle.toCircle(shapes[3]);
    shapes[9] = Circle.toCircle(shapes[5]);
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
