import Line.Line;
import Point.point;

public class Main{
    public static void main(String[] args){
        point p1 = new point(10,20);
        point p2 = new point(20,40);

        Line NewLine = new Line(p1,p2);
        NewLine.DisplayLine();
    }
}