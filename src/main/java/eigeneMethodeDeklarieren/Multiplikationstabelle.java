package eigeneMethodeDeklarieren;

public class Multiplikationstabelle {
    public static void main(String[] args) {
        System.out.println("Bitte Anzahl angeben: ");
        int anzahl = new java.util.Scanner(System.in).nextInt();
        if (anzahl < 1)
            return;
        System.out.println("<html>\n" +
                "<table>\n" +
                "<tr><th>Quantity</th><th>Flamethrower</th></tr>");
        for (int i = 1; i <= anzahl; i++) {
            printTabelle(i);
        }
        System.out.println("</table>\n" +
                "</html>");
    }

    static void printTabelle(int anzahl){
        int preis = anzahl * 500;
        System.out.println("<tr><td>" + anzahl + "</td><td>" + preis + "</td></tr>");
    }
}
