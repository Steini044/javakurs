package zeichenketten;

public class SumOfTheDigits {
    public static int digitSum(long value){
        int result = 0;
        while(value > 0){
           int singleDigit = (int) (value % 10);
           result += singleDigit;
           value = value / 10;
        }
        return result;
    }

//    public static int digitSum(long value){
//        return digitSum(String.valueOf(value));
//    }
    public static int digitSum(String value){
        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            result += Character.getNumericValue(value.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(696542));
        System.out.println(digitSum("676"));
    }
}
