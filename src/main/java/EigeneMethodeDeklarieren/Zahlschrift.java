package EigeneMethodeDeklarieren;

public class Zahlschrift {
    public static void main(String[] args) {
        System.out.println("Gebe eine Zahl zwischen 1 und 9999 an: ");
        int zahl = new java.util.Scanner(System.in).nextInt();

        startSvg();
        style();
        startLinie();

        closeSvg();
    }

    static void startSvg() {
        System.out.println("<svg height=\"1400\" width=\"1400\">");
    }
    static void style() {
        System.out.println("<g style=\"stroke:grey;stroke-linecap:round;stroke-width:2\">");
    }
    static void startLinie() {
        System.out.println("<line x1=\"100\" y1=\"85\" x2=\"100\" y2=\"115\" />");
    }

    static void closeSvg() {
        System.out.println("</g>\n" + "</svg>");
    }
}
