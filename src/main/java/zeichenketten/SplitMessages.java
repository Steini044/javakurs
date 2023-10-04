package zeichenketten;

public class SplitMessages {
    public static String joinSplitMessages(String ... strings){
        StringBuilder result = new StringBuilder(strings.length);
        int longestString = 0;
        for(String string: strings){
            longestString = Math.max(longestString, string.length());
        }
        for (int i = 0; i < longestString; i++) {
            for (String string: strings){
                if(string.length() > i){
                    result.append(string.charAt(i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinSplitMessages("Hoy","ok"));
        System.out.println(joinSplitMessages("H","","ooky"));
        System.out.println(joinSplitMessages("Hk","oy","o"));
        System.out.println(joinSplitMessages("Hooky"));
    }
}
