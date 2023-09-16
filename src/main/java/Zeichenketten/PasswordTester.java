package Zeichenketten;

public class PasswordTester {
    public static boolean isGoodPassword(String password){
        int kleinBuchstaben = 0;
        int grossbuchstaben = 0;
        int zahlen = 0;
        int sonderzeichen = 0;
        if(password.length() < 6){
            System.err.println("Password is too short");
            return false;
        }
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(Character.isLowerCase(c)){
                kleinBuchstaben = 1;
            } else if (Character.isUpperCase(c)) {
                grossbuchstaben = 1;
            } else if (Character.isDigit(c)) {
                zahlen = 1;
            } else {
                sonderzeichen = 1;
            }
        }
        if(kleinBuchstaben == 0){
            System.err.println("Must contain lower case latters");
            return false;
        }
        if(grossbuchstaben == 0){
            System.err.println("Must contain upper case letters");
            return false;
        }
        if(zahlen == 0){
            System.err.println("Must contain numbers");
            return false;
        }
        if(sonderzeichen == 0){
            System.err.println("Must contain special characters like .!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isGoodPassword("Hallo123$"));
        System.out.println(isGoodPassword("hallo123$"));
        System.out.println(isGoodPassword("HALLO123$"));
        System.out.println(isGoodPassword("Hallo$"));
        System.out.println(isGoodPassword("Hallo123"));
        System.out.println(isGoodPassword("hallo123"));
    }
}
