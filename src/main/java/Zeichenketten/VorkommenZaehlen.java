package Zeichenketten;

public class VorkommenZaehlen {
    public static int countMatches(String string, String other){
        if(string == null ||
                string.isEmpty() ||
                other == null ||
                other.isEmpty()){
            return 0;
        }

        if(other.length() > string.length()){
            return 0;
        }

        int stringLength = string.length();
        int otherLength = other.length();
        int result = 0;
        for (int i = 0; i <= stringLength - otherLength; i++) {
            if(string.substring(i, i + otherLength).equals(other)){
                result++;
                i += otherLength - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countMatches(null,"anything"));
        System.out.println(countMatches("anything",""));
        System.out.println(countMatches("abba","a"));
        System.out.println(countMatches("abba","ab"));
        System.out.println(countMatches("aaaa","aa"));
        System.out.println(countMatches("abba","xxx"));
    }
}
