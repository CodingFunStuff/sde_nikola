package Structural;

//Structural.ColoredShape class
public class ColoredShape implements Shape {

  private final Shape shape;
  private final String color;

  public ColoredShape(Shape shape, String color) {
    this.shape = shape;
    this.color = color;
  }

  @Override
  public void draw() {
    shape.draw();
    System.out.println("Color: " + color);
  }
}
