package prob2.intfaces2;

public class Ellipse implements ClosedCurve{
 public double semiaxis;
    public double elaterial;

    public Ellipse(double semiaxis, double elaterial) {
        this.semiaxis = semiaxis;
        this.elaterial = elaterial;
    }

    @Override
    public double computePerimeter() {
        return 4*semiaxis*elaterial;
    }
}
