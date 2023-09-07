package ForSchleifen;

public class AnzahlZiffern {
    public static void main(String[] args) {
        System.out.println("Gebe Bitte eine Ganzahl ein: ");
        int zahl = new java.util.Scanner(System.in).nextInt();
        int ziffernAnzahl = 1;
// Ich ohne diese Zeilen bekommt man bei negativen werten eine Ziffernanzahl von +1, was für unsere Anwendung allerdings sogar erwünscht sein könnte
//        if (zahl < 0) {
//            zahl = Math.abs(zahl);
//        }
        while (zahl != 0) {
            ziffernAnzahl++;
            zahl /= 10;
            //System.out.println(zahl);
        }
        System.out.println(ziffernAnzahl);
    }
}
