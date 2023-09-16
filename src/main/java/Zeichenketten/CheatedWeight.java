package Zeichenketten;

public class CheatedWeight {
    public static int cheatedWeight(int weight){
        StringBuilder sb = new StringBuilder().append(weight);
        int index = 0;
        int smallestNumber = 99;
        for (int i = 0; i < sb.length(); i++) {
            int numberAtI = Character.getNumericValue(sb.charAt(i));
            if(numberAtI < 0){
                return -1;
            }
            if(numberAtI <= smallestNumber && numberAtI > 0){
                smallestNumber = numberAtI;
                index = i;
            }
        }
        swap(sb, index);
        return Integer.parseInt(sb.toString());
    }

    public static void swap(StringBuilder sb, int index){
        char temp = sb.charAt(0);
        sb.setCharAt(0,sb.charAt(index));
        sb.setCharAt(index,temp);
    }

    public static void main(String[] args) {
        System.out.println(cheatedWeight(1234));
        System.out.println(cheatedWeight(4312));
        System.out.println(cheatedWeight(0));
        System.out.println(cheatedWeight(4));
        System.out.println(cheatedWeight(100));
        System.out.println(cheatedWeight(98765443));

    }
}
