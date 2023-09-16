package Zeichenketten;

public class RepeatingStrings {
    public static String repeatingStrings(String string){
        if(string == null || string.length() < 2){
            return null;
        }

        int stringMiddleLength = string.length() / 2;

        for (int i = 1; i < stringMiddleLength; i++) {
            String substring = string.substring(0,i);
            String repeatingSubstring = substring;
            while(repeatingSubstring.length() < string.length()){
                repeatingSubstring += substring;
            }
            if(repeatingSubstring.equals(string)){
                return substring;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(repeatingStrings("🌼🌼🌼"));
        System.out.println(repeatingStrings("🌼🌻🌼🌻🌼🌻"));
    }
}
