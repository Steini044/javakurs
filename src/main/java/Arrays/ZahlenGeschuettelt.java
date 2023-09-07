package Arrays;

public class ZahlenGeschuettelt {
    public static int[] shuffleDice() {
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = (int) ((Math.random() * 6) + 1);
        }
        return result;
    }

    public static boolean isHomogeneous(int[] values) {
        if (values.length == 0)
            return false;

        int firstNumber = values[0];
        for (int i = 0; i < values.length; i++) {
            if (firstNumber != values[i])
                return false;
        }
        return true;
    }

    public static int[] occurrences(int[] values) {
        int[] result = new int[6];

        if (values.length == 0)
            return result;

        for (int i = 0; i < values.length; i++) {
            switch (values[i]) {
                case 1:
                    result[0]++;
                    break;
                case 2:
                    result[1]++;
                    break;
                case 3:
                    result[2]++;
                    break;
                case 4:
                    result[3]++;
                    break;
                case 5:
                    result[4]++;
                    break;
                case 6:
                    result[5]++;
                    break;
                default:
            }
        } // end for
        return result;
    }

    public static boolean isFullHouse(int[] values) {
        if (values.length == 0)
            return false;

        boolean checkTwo = false;
        boolean checkThree = false;

        for (int occurrence : occurrences(values)) {
            switch (occurrence) {
                default -> {
                    return false;
                }
                case 2 -> {
                        checkTwo = true;
                }
                case 3 -> {
                        checkThree = true;
                }
            }
        } // end for
        return (checkTwo && checkThree);
    }

    public static void printDiceValues(int[] points) {
        if (points.length == 0)
            System.out.println("Es wurde kein Würfel geworfen!");

        int[] occurrences = occurrences(points);
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.printf("%d x %s, ", occurrences[i], dieNumber(occurrences[i]));
            }
        }
        System.out.println();
    }

    private static String dieNumber(int value) {
        switch (value) {
            case 1 -> {
                return "\u2680";
            }
            case 2 -> {
                return "\u2681";
            }
            case 3 -> {
                return "\u2682";
            }
            case 4 -> {
                return "\u2683";
            }
            case 5 -> {
                return "\u2684";
            }
            case 6 -> {
                return "\u2685";
            }
            default -> {

            }
        }
        return "Falsche Eingabe";
    }

    public static void main(String[] args) {
        int[] wurfelErgebnisse = shuffleDice();
        for (int i = 0; i < wurfelErgebnisse.length; i++) {
            System.out.println(wurfelErgebnisse[i]);
        }
        System.out.println(isHomogeneous(wurfelErgebnisse));
        int[] homogenous = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(isHomogeneous(homogenous));

        int[] verteilung = occurrences(wurfelErgebnisse);
        for (int i = 0; i < verteilung.length; i++) {
            System.out.printf("%d, ", verteilung[i]);
        }
        System.out.println();
        System.out.println(isFullHouse(wurfelErgebnisse));
        int[] fullHouse = {1, 1, 1, 2, 2};
        System.out.println(isFullHouse(fullHouse));
        printDiceValues(wurfelErgebnisse);
    }
}
