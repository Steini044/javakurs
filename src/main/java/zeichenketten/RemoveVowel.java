package zeichenketten;

public class RemoveVowel {
    public static String removeVowels(String string){
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            switch(sb.charAt(i)){
                case 'A','a','Ä','ä','E','e','I','i','O','o','Ö','ö','U','u','Ü','ü','Y','y' -> sb.deleteCharAt(i);
                default -> {
                }
            }
        }
        return sb.toString();
    }

    public static String removeVowels2(String string){
        return string.replaceAll("[aeiouyäüöAEIOUYÄÖÜ]", "");
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("HalloJavanesen"));
        System.out.println(removeVowels2("HalloJavanesen"));
    }
}
