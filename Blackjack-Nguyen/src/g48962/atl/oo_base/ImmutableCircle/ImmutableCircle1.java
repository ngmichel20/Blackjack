package g48962.atl.oo_base.ImmutableCircle;
import g48962.atl.oo_base.*;


/**
 *
 * @author g48962
 */
public final class ImmutableCircle1 {

    private final double radius;
    private final Point center;

    public ImmutableCircle1(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive"
                    + ", received: " + radius);
        }
        this.center = new Point(center); //copie défensive
        this.radius = radius;
        //this.center = center;
    }

    public ImmutableCircle1 move(double dx, double dy) {
        Point centre = new Point(center);
        centre.move(dx, dy);
        return new ImmutableCircle1(centre, radius);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public Point getCenter() {
        return new Point(center); //copie défensive
    }

    public ImmutableCircle1 scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive"
                    + ", received: " + factor);
        }
        double newRadius = radius;
        return new ImmutableCircle1(getCenter(), newRadius*factor);
        //radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle : [" + center + ", " + radius + "]";
    }
}

class TestImmutableCircle1 {

    public static void main(String args[]) {
        Point p = new Point();
        ImmutableCircle1 c = new ImmutableCircle1(p, 5);
        System.out.println(c);
        c.move(2, 5);
        System.out.println(c);
        c.scale(2);
        System.out.println(c);
    }
}

class TestDefensiveCopyImmutableCircle1 {

    public static void main(String args[]) {
        Point p = new Point();
        ImmutableCircle1 c = new ImmutableCircle1(p, 5);
        System.out.println(c);
        p.move(2, 5); //on bouge le point et non pas le cercle.
        System.out.println(c);
        Point p2 = c.getCenter();
        p2.move(-2, -5);
        System.out.println(c);
    }
}
