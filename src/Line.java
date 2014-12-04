// A Line object represents a line defined by a pair of Points.
import java.util.*;

public class Line {
  Point start;
  Point end;
  
  public Line () {
    start.setX(0);
    start.setY(0);
    end.setX(0);
    end.setY(0);
  }
  
  public Line (Point startPoint, Point endPoint) {
    start = startPoint;
    end = endPoint;
  }
  
  public double length () {
    return start.distance(end);
  }
  
  public double slope () {
    double slope = (double) ((end.getY()-start.getY()) / (end.getX() - start.getX()));
    return slope;
  }
  
  public String toString () {
    return "[" + start.toString() + "," + end.toString() + "]";
  }
  
  public void translate (int x, int y) {
    start.translate (x, y);
    end.translate (x, y);
  }
}
