package g48962.atl.oo_base;

public class Point {
    
    private double x;
    private double y;
    
    public Point() {
        this(0,0);
    }
    
    public Point(Point p) {
        this(p.x, p.y);
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
//    public void move(int dx,int dy) {
//    System.out.println("méthode move(int, int)");
//    x += dx;
//    y += dy;
//}

}

class TestPoint {
    public static void main(String args[]) {
        Point p = new Point();
        System.out.println(p);
        p.move(2,2);
        System.out.println(p);
        //System.out.println(p.x);
    }
}

