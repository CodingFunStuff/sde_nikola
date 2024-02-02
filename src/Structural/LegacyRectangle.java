package Structural;

// Structural.LegacyRectangle class
public class LegacyRectangle {
  private final int x;
  private final int y;
  private final int w;
  private final int h;
  public LegacyRectangle(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  public void draw() {
    System.out.println("Legacy Structural.Rectangle at (" + x + "," + y + ") with width " + w + " and height " + h);
  }
}

