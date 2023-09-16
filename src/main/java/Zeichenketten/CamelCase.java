package Zeichenketten;

public class CamelCase {
    public static String camelCaseSplitter(String string){
        StringBuilder result = new StringBuilder();
        if(string.length() < 2){
            return string;
        }
        result.append(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            char c = string.charAt(i);
            if(Character.isUpperCase(c) &&Character.isLowerCase(string.charAt(i - 1))) {
                result.append(" ").append(c);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCaseSplitter("List"));
        System.out.println(camelCaseSplitter("CiaoCiao"));
        System.out.println(camelCaseSplitter("numberOfElements"));
        System.out.println(camelCaseSplitter("CiaoCiaoCAPTAIN"));
        System.out.println(camelCaseSplitter(""));
        System.out.println(camelCaseSplitter("1queen "));
    }
}
