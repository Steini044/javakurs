package arrays;

public class Windgeschwindigkeit {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] windSpeed = new int[LENGTH];
        int[] windDirection = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            windSpeed[i] = randomInt(200);
            windDirection[i] = randomInt(360);
        }

        printWindSpeedAndDirection(windSpeed, windDirection, LENGTH);
    }

    static void printWindSpeedAndDirection(int[] windSpeed, int[] windDirection, int length) {
        for (int i = 0; i < length - 1; i++) {
            System.out.printf("wind speed %d km/h and wind direction %d°, ", windSpeed[i], windDirection[i]);
        }
        System.out.printf("wind speed %d km/h and wind direction %d° ", windSpeed[length - 1], windDirection[length - 1]);
    }

    static int randomInt(int max) {
        return ((int) (Math.random() * max));
    }
}
