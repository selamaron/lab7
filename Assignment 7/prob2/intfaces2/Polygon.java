package prob2.intfaces2;

public interface Polygon extends ClosedCurve{
    default double computePerimeter(){
        return 0;
    }

    double[] getLength();
}