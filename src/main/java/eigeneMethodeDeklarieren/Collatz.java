package eigeneMethodeDeklarieren;

public class Collatz {
    public static void main(String[] args) {
        collatz(27);
        collatzMax(27,27);
    }

    static void collatz(long n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else if (n % 2 == 0) {
            System.out.println(n);
            collatz(n / 2);
        } else {
            System.out.println(n);
            collatz(3 * n + 1);
        }
    }

    static long collatzMax(long n, long max) {
        if (n == 1) {
            System.out.println(n);
            System.out.println(max);
            return max;
        } else if (n % 2 == 0) {
            System.out.println(n);
            return (collatzMax(n / 2, Math.max(n, max)));
        } else {
            System.out.println(n);
            return (collatzMax(3 * n + 1, Math.max(n, max)));
        }
    }
}
