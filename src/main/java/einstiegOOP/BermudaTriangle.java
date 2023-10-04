package einstiegOOP;

import java.awt.*;

public class BermudaTriangle {
    public static void main(String[] args) {
        final int    DIMENSION = 50;
        final String RAINBOW = "\uD83C\uDF08";
        final String FOG     = "\uD83C\uDF2B";
        final String OCTOPUS = "\uD83D\uDC19";

        Polygon polygon = new Polygon();
        polygon.addPoint(10,50);
        polygon.addPoint(30,50);
        polygon.addPoint(45,15);

        for (int x = 0; x < 50; x++) {
            for (int y = 0; y < 50; y++) {
                if(x == 0 || y == 0 || x == DIMENSION - 1 || y == DIMENSION - 1) {
                    System.out.print( RAINBOW );
                } else {
                    System.out.print(polygon.contains(x,y) ? OCTOPUS : FOG);
                }
            }
            System.out.println();
        }
    }

    static Polygon resetWithRandomTriangle(Polygon polygon) {
        polygon.reset();
        polygon.addPoint(randomNumber(),randomNumber());
        polygon.addPoint(randomNumber(),randomNumber());
        polygon.addPoint(randomNumber(),randomNumber());
        return polygon;
    }

    static Polygon createRandomTriangle(){
        Polygon polygon = new Polygon();
        return (resetWithRandomTriangle(polygon));
    }

    static int randomNumber(){
        int max = 50;
        return ((int) (Math.random() * 50));
    }
}
