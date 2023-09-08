package Arrays;

public class SVGPolygone {
    public static void printSvgPolygon(int ... coordinaten){
        if(coordinaten.length % 2 != 0)
            return;
        System.out.print("<polygon points=\"");
        for (int i = 0; i < coordinaten.length; i += 2) {
            System.out.print(coordinaten[i] + ", " + coordinaten[i + 1] + " ");
        }
        System.out.print("\" />");
        System.out.println();
    }

    public static void main(String[] args) {
        printSvgPolygon(200, 10, 250, 190, 160, 210);
    }
}
