package zeichenketten;

public class Diamond {
    public static void printDiamond(int breite){
        if(breite < 1){
            return;
        }
        if (breite > 2 * 26 - 1){
            breite = 2 * 26 - 1;
        }

        char c = 'A';

        //TODO methode für die richtigen Buschstaben und das letzte 4tel des Diamanten
        for (int i = 0; i < breite; i++) {
            if(i < breite/2){
                for (int j = 0; j < breite/2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i*2 + 1; j++) {
                    System.out.printf("%c",c + j);
                }
                System.out.println();
            } else if (i > breite / 2) {
                for (int j = 0; j < i - breite/2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < breite - i; j++) {
                    System.out.printf("%c",c + j);
                }
                System.out.println();
            } else {
                for (int j = 0; j < i*2 + 1; j++) {
                    System.out.printf("%c",c + j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printDiamond(7);
    }
}
