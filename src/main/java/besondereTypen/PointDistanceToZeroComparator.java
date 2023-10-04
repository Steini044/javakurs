package besondereTypen;

import java.util.Arrays;
import java.util.Comparator;
import java.awt.Point;

public class PointDistanceToZeroComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return Double.compare(o1.distance(0,0), o2.distance(0,0));
    }

    public static void main(String[] args) {
        Point[] points = { new Point( 9, 3 ), new Point( 3, 4 ), new Point( 4, 3 ), new Point( 1, 2 ) };
        Arrays.sort( points, new PointDistanceToZeroComparator() );
        System.out.println( Arrays.toString( points ) );
    }
}
