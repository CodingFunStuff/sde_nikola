package Structural;

//Structural.BorderedShape class
public class BorderedShape implements Shape {
  private final Shape shape;
  private final String color;

  public BorderedShape(Shape shape, String color) {
    this.shape = shape;
    this.color = color;
  }

  @Override
  public void draw() {
    shape.draw();
    System.out.println("Border Color: " + color);
  }
}
