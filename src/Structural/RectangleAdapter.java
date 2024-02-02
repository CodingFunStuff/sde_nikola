package Structural;

// Structural.RectangleAdapter class
public class RectangleAdapter implements Shape {

  private final LegacyRectangle legacyRect;

  public RectangleAdapter(LegacyRectangle legacyRect) {
    this.legacyRect = legacyRect;
  }

  public void draw() {
    legacyRect.draw();
  }
}
