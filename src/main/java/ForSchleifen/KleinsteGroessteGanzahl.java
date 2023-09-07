package ForSchleifen;

public class KleinsteGroessteGanzahl {
    public static void main(String[] args) {
        long number = new java.util.Scanner(System.in).nextLong();
        long largest = 0;
        long smallest = (0 == number) ? 0 : 9;


        for (long value = Math.abs(number); value != 0; value /= 10) {
            long lastDigit = value % 10;
            largest = Math.max(largest, lastDigit);
            smallest = Math.min(smallest, lastDigit);
        }
        System.out.println(largest + "," + smallest);
    }
}
