package Zeichenketten;

import java.util.Arrays;

public class UnaereKodierung {
    public static String encode(int ... values){
        if(values == null)
            return "";
        StringBuilder result = new StringBuilder(values.length);
        for (int value:values) {
            for (int i = 0; i < value; i++) {
                result.append(1);
            }
            result.append(0);
        }
        return result.toString();
    }

    public static int[] decode(String value){
        int arrayCounter = 0;
        int[] resultArray;
        int arraySize = 0;

        for (int i = 0; i < value.length(); i++) {
            if(Character.getNumericValue(value.charAt(i)) == 0){
                arraySize++;
            }
        }

        resultArray = new int[arraySize];

        for (int i = 0; i < value.length(); i++) {
            int numericValue = Character.getNumericValue(value.charAt(i));
            if(numericValue < 0){
                System.err.println("No valid input");
                return null;
            }
            if(numericValue == 0){
                arrayCounter++;
            }
            if(numericValue > 0){
                for (int j = 0; j < numericValue; j++) {
                    resultArray[arrayCounter]++;
                }
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
        System.out.println(encode(0, 1, 2, 3, 0, 1));
        System.out.println(encode(0, 0, 0, 0));
        System.out.println(encode());
        System.out.println(Arrays.toString(decode("0101101110010")));
    }
}
