package exceptions;

import java.util.Arrays;

public class ParseInts {
    public static int[] parseInts(String ... numbers){
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                result[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e){
                result[i] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = { "1", "234", "333" };
        int[] ints1 = parseInts( strings );                                // [1, 234, 333]
        int[] ints2 = parseInts( "1", "234", "333" );                      // [1, 234, 333]
        int[] ints3 = parseInts( "1", "ll234", "3", null, "99" );          // [1, 0, 3, 0, 99]
        int[] ints4 = parseInts( "Person", "Woman", "Man", "Camera, TV" ); // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));
        System.out.println(Arrays.toString(ints4));
    }
}
