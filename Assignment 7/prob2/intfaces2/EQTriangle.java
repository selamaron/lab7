package prob2.intfaces2;

public class EQTriangle implements Polygon{
    double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    @Override
    public double computePerimeter() {
       return 3*side;
    }

    @Override
    public double[] getLength() {
//        double array[] = new double[3];
//        array[0] = side;
//        array[1] = side;
//        array[2] = side;
        //return array;
        return new double[]{side, side, side};
    }
}
