package zeichenketten;

public class Wiese {
    public static void printFlowers(String reihenfolge) {
        String flowers = "       _                                                              \n" +
                "              _(_)_                          wWWWw   _                       \n" +
                "  @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_                       \n" +
                " @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)                     \n" +
                "  @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\                     \n" +
                "   /      Y       \\|    \\|/    /(_)    \\|      |/      |                    \n" +
                "\\ |     \\ |/       | / \\ | /  \\|/       |/    \\|      \\|/                \n" +
                "\\\\|//   \\\\|//   \\\\\\|//\\\\\\|/// \\|///  \\\\\\|//  \\\\|//  \\\\\\|//  \n" +
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^             ";

        String[] flower = flowers.split("\n");
        int[] endOfFlower = {0, 7, 13, 22, 29, 37, 44, 50, 58};

        for (int i = 0; i < 9; i++) {
            for(int count = 0; count < reihenfolge.length(); count++){
                int flowerNumber = whichFlower(reihenfolge.charAt(count));
                System.out.print(flower[i].substring(endOfFlower[flowerNumber], endOfFlower[flowerNumber + 1]));
            }
            System.out.println();
        }

    }

    public static int whichFlower(char c){
        int numericValue = Character.getNumericValue(c);
        if(numericValue < 1 || numericValue > 8) {
            return 0;
        }
        return numericValue - 1;
    }
    public static void main(String[] args) {
        printFlowers("1118887264598AHGZe7");
    }
}
