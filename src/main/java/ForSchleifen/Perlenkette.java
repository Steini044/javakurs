package ForSchleifen;

public class Perlenkette {
    public static void main(String[] args) {
        System.out.println("<svg height=\"100\" width=\"1000\">");

        for (int i = 20; i < 520; i += 10) {
//            int random = (int) (Math.random() * 3) + 1;
//            switch (random) {
//                case 1:
//                    System.out.println(" <circle cx=\"" + i + "\" cy=\"20\" r=\"5\" fill=\"blue\" />");
//                    break;
//                case 2:
//                    System.out.println(" <circle cx=\"" + i + "\" cy=\"20\" r=\"5\" fill=\"green\" />");
//                    break;
//                case 3:
//                    System.out.println(" <circle cx=\"" + i + "\" cy=\"20\" r=\"5\" fill=\"orange\" />");
//                    break;

            double random = Math.random();
            String color = random < 1. / 3 ? "blue" :
                    random < 2. / 3 ? "green" : "orange";
            System.out.printf("<circle cx=\"%d\" cy=\"20\" r=\"5\" fill=\"%s\"/>%n", i, color);
        }

        System.out.println("</svg>");
    }
}
