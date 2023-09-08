package Arrays;

import static java.util.Collections.swap;

public class Tratraphobia {
    public static int[] fourLast(int... numbers) {
        if (numbers == null) {
            System.out.println("Fehler, numbers can´t be null");
            return new int[]{};
        }

        if (numbers.length < 2) {
            return numbers;
        }

        for (int startIndex = 0; startIndex < numbers.length; startIndex++) {
            if (!containsFour(numbers[startIndex])) {
                continue;
            }
            if (startIndex < numbers.length - 1) {
                for (int i = startIndex + 1; i < numbers.length; i++) {
                    if (!containsFour(numbers[i])) {
                        int swap = numbers[startIndex];
                        numbers[startIndex] = numbers[i];
                        numbers[i] = swap;
                    }
                }
            }

        }
        return numbers;
    }

    public static boolean containsFour(int number) {
        while (number > 0) {
            if (number % 10 == 4) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 87652;
        System.out.println(containsFour(num));
        int[] numbers = {1, 44, 2, 4, 43};

        for (int number : fourLast(numbers)) {
            System.out.print(number + " ");
        }
    }
}
