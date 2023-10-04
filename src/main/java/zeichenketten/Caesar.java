package zeichenketten;

public class Caesar {
    public static String caesar(String s, int rotation){
        StringBuilder sb = new StringBuilder();
        while(rotation < 0){
            rotation = 26 + rotation;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                sb.append(c);
            } else {
                sb.append(caesarChar(c, rotation));
            }
        }
        return sb.toString();
    }

    public static char caesarChar(char c, int rotation){
        char result;
        if(c < 91){
            result = (char) (c + rotation);
            if(result > 90){
                result = (char) (result - 26);
            }
        } else {
            result = (char) (c + rotation);
            if(result > 122){
                result = (char) (result - 26);
            }
        }
        return result;
    }

    public static String decaesar(String s, int rotation){
        while(rotation < 0){
            rotation = 26 + rotation;
        }
        while(rotation > 26){
            rotation -= 26;
        }
        return caesar(s,26 - rotation);
    }
    public static void main(String[] args) {
        System.out.println(caesar("abxyz. ABXYZ!", 13));
        System.out.println(decaesar(caesar("abxyz. ABXYZ!", 13), 13));
    }
}
