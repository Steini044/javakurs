package forSchleifen;

public class schachbrett {
    public static void main(String[] args) {
        System.out.println("Bitte gebe die Breite an: ");
        int width = new java.util.Scanner(System.in).nextInt();

        System.out.println("Bitte gebe die Höhe an: ");
        int height = new java.util.Scanner(System.in).nextInt();

        boolean weiss = false;
        if (width > 0 && height > 0) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (weiss == true){
                        System.out.printf("_");
                        weiss = false;
                    } else {
                        System.out.printf("#");
                        weiss =true;
                    }
                }
                System.out.println();
                if(width % 2 == 0){
                    if(weiss == true){
                        weiss = false;
                    } else {
                        weiss = true;
                    }
                }
            }
        }
    }
}
