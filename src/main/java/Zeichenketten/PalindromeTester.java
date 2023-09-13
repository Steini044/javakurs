package Zeichenketten;

public class PalindromeTester {
    public static boolean isPalindrome(String s){
        int length = s.length();
        for (int i = 0; i < (length / 2); i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeIgnoringCase(String s){
        return isPalindrome(s.toLowerCase());
    }

    public static boolean isPalindromeIgnoringNonLettersAndDigits(String s) {
        for(int startIndex = 0, endIndex = s.length() - 1; startIndex < endIndex; startIndex++, endIndex--){
            while (! Character.isLetterOrDigit(s.charAt(startIndex))){
                startIndex++;
            }
            while (! Character.isLetterOrDigit(s.charAt(endIndex))){
                endIndex--;
            }
            char startChar = Character.toLowerCase(s.charAt(startIndex));
            char endChar = Character.toLowerCase(s.charAt(endIndex));
            if(startChar != endChar){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("mammam"));
        System.out.println(isPalindromeIgnoringCase("Ma´Am"));
        System.out.println(isPalindromeIgnoringNonLettersAndDigits("Sei fies – stets sei fies!"));
        System.out.println(isPalindromeIgnoringNonLettersAndDigits("----s------------"));
    }
}
