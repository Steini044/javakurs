package EigeneMethodeDeklarieren;

public class RightTriangle {
    public static boolean isRightTriangle( double a, double b, double c) {
        return a * a == b * b + c * c ||
                b * b == a * a + c * c ||
                c * c == a * a + b *b;
    }

    public static void main(String[] args) {
        System.out.println(isRightTriangle(3, 4, 5));
        System.out.println(isRightTriangle(5, 4, 3));
        System.out.println(isRightTriangle(5, 12, 13));
        System.out.println(isRightTriangle(1, 1, Math.sqrt(2)));
    }
}
