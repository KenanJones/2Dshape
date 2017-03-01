import edu.jalc.shape.*;

public class ShapeDriver{
  public static void main(String... args){
    TwoDimensionalShape[] shapes = new TwoDimensionalShape[4];
    shapes[0] = new Circle(10);
    shapes[1] = new Ellipse(10,10);
    shapes[2] = new Rectangle(24,1.5);
    shapes[3] = new Square(6);
    System.out.println(shapes[0].equals(shapes[1]));
    System.out.println(shapes[2].equals(shapes[3]));
    for(int i = 0; i < shapes.length; i++){
      System.out.println(shapes[i].toString());
    }
  }
}
