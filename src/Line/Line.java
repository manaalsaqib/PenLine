package Line;
import Point.point;
public class Line {
    private point start;
    private point end;

  public Line(point starts, point ends) {
      this.start = start;
      this.end = end;
  }
  public void DisplayLine(){
      point p1 = new point(10,20);
      point p2 = new point(20,40);
      System.out.println("Line starts from " + p1.getX() +" " +  p1.getY() + " and ends at " + p2.getX() + " "+ p2.getY());
  }
}
