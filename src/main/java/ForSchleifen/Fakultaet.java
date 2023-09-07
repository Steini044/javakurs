package ForSchleifen;

public class Fakultaet {
    public static void main(String[] args) {
        long zahl = new java.util.Scanner(System.in).nextLong();
        long fakultaet = 1;

        if (zahl < 0) {
            System.out.println("Number must not be negative");
        } else if (zahl == 0) {
            System.out.println("0! = 1");
        } else {
            System.out.print(zahl + "! = 1");
            for(long i = 2; i < zahl + 1; i++) {
                fakultaet = Math.multiplyExact(fakultaet, i);
                System.out.print(" * " + i);
            }
            System.out.print(" = " + fakultaet);
        }


    }
}
