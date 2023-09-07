package Arrays;

import java.awt.*;

public class KinoFinden {
    public static void main(String[] args) {
        Point[] points = { new Point(10, 20), new Point(12, 2), new Point(44, 4) };
        double minDistance = minDistance(points, points.length);
        System.out.println(minDistance);

        Point closestPoint = minDistancePoint(points, points.length);
        System.out.println(closestPoint);
    }

    static double minDistance(Point[] points, int size) {
        if(points.length == 0 || size > points.length)
            return 0; //Exception
        double minDistance = points[0].distance(0,0);
        for (int i = 0; i < size; i++) {
            minDistance = Math.min(minDistance, points[i].distance(0,0));
        }
        return minDistance;
    }

    static Point minDistancePoint(Point[] points, int size) {
        if(points.length == 0 || size > points.length)
            return new Point(0,0); //Exception
        Point closest = points[0];
        for (int i = 0; i < size - 1; i++) {
            if(points[i].distance(0,0) > points[i + 1].distance(0,0))
                closest = points[i + 1];
        }
        return closest;
    }
}
