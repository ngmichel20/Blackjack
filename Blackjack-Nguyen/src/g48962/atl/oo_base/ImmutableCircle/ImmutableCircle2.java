package g48962.atl.oo_base.ImmutableCircle;
import g48962.atl.oo_base.*;
/**
 *
 * @author g48962
 */
public final class ImmutableCircle2 {
    private final double radius;
    private final ImmutablePoint center;

    public ImmutableCircle2(ImmutablePoint center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive"
                    + ", received: " + radius);
        }
        //this.center = new Point(center); //copie défensive
        this.radius = radius;
        this.center = center;
    }

    public ImmutableCircle2 move(double dx, double dy) {
//        ImmutablePoint centre ;
//        centre = center.move(dx, dy);
        return new ImmutableCircle2(center.move(dx, dy), radius);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public ImmutablePoint getCenter() {
        return center;
    }

    public ImmutableCircle2 scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive"
                    + ", received: " + factor);
        }
        double newRadius = radius;
        return new ImmutableCircle2(getCenter(), newRadius*factor);
        //radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle : [" + center + ", " + radius + "]";
    }
}

class TestImmutableCircle2 {

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

class TestDefensiveCopyImmutableCircle2 {

    public static void main(String args[]) {
       ImmutablePoint p = new ImmutablePoint();
        ImmutableCircle2 c = new ImmutableCircle2(p, 5);
        System.out.println(c);
        p.move(2, 5); //on bouge le point et non pas le cercle.
        System.out.println(c);
        ImmutablePoint p2 = c.getCenter();
        p2.move(-2, -5);
        System.out.println(c);
    }
}

