package zeichenketten;

public class SichereUebertragung {
    public static int isEveryCharacterTwice(String string){
        if(string.length() % 2 != 0){
            return 0;
        }
        // If for example C == c then use
        // string.toLowerCase()
        for (int i = 0; i < string.length(); i += 2) {
            if(string.charAt(i) != string.charAt(i + 1)){
                return -i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String string = "HHaalloo$$CCaappttaaiinn";
        System.out.println(isEveryCharacterTwice(string));
    }
}
