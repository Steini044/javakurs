package ForSchleifen;

public class Weihnachtsbaum {
    public static void main(String[] args) {
        System.out.println("Gebe bitte die maximale Breite an: ");
        int width = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= width; i += 2) {
            for (int j = 1; j <= width - i / 2; j += 1) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++){
                double weihnachtskugel = Math.random();
                if (weihnachtskugel < 0.2){
                    System.out.printf("o");
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
