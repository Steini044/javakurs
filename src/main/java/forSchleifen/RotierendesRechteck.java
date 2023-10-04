package forSchleifen;

public class RotierendesRechteck {
    public static void main(String[] args) {
        for (int i = 0; i < 370; i += 10) {
            System.out.println("<svg height=\"200\" width=\"200\">\n" +
                    " <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"\n" +
                    "       transform=\"rotate(" + i + " 100 100)\" />\n" +
                    "</svg>");
        }
    }
}
