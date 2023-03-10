import javax.xml.transform.Source;

class Point{
    double x,y;
    public Point(double X,double Y){
        x = X;
        y = Y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x - p.x)*(x-p.x)+(y-p.y)*(y+p.y));
    }
}


public class Constructor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }
}
