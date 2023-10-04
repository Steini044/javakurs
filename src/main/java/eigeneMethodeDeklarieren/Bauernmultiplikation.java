package eigeneMethodeDeklarieren;

public class Bauernmultiplikation {
    public static void main(String[] args) {
        System.out.println(bauernmultiplikation(22, 3));
        System.out.println(bauernmultRecursive(22,3));
    }

    static int bauernmultiplikation(int a, int b) {
        int rest = 0;
        while(a > 0) {
            if(a % 2 == 0) {
                a /= 2;
                b *= 2;
            } else {
                rest += b;
                a = (a - 1) / 2;
                b *= 2;
            }
        }
        return rest;
    }

    static int bauernmultRecursive(int a, int b) {
        if (a == 1)
            return b;
        if(a % 2 == 0) {
            return(bauernmultRecursive(a / 2, b * 2));
        } else {
            return(bauernmultRecursive((a - 1) / 2, b * 2) + b);
        }
    }
}
