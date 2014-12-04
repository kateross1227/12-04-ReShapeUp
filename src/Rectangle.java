// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.util.*;

public class Rectangle {
  private Point origin;
  private int width;
  private int height;
  
  public Rectangle() {
    origin = new Point();
    width = 0;
    height = 0;
  }
  
  public Rectangle(Point a, Point b) {
    origin = a;
    width = b.getX() - a.getX();
    height = b.getY() - a.getY();
  }
  
  public Rectangle(Point a, int x, int y) {
    origin = a;
    width = a.getX()-x;
    height = a.getY()-y;
  }
  
  public Point getBottomLeft() {
    return origin;
  }
  
  public Point getTopRight() {
    return new Point(origin.getX() + width, origin.getY() + height);
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getWidth() {
    return width;
  }
  
  public double area() {
    return (width * height);
  }
  
  public double diagonal() {
    return Math.sqrt((width * width) + (height * height));
  }
  
  public int perimeter() {
    return ((2 * width) + (2 * height));
  }
  
  public boolean isSquare() {
    return (width == height);
  }
  
  public String toString() {
    return "[" + origin.toString() + ", " + getTopRight().toString() + "]";
  }
  
  public void translate(int x, int y) {
    origin.translate(x, y);
  }
  
  public void scale(int dx, int dy) {
    width += dx;
    height += dy;
  }
}
