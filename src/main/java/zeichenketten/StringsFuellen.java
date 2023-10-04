package zeichenketten;

public class StringsFuellen {
    public static String mix(String string, String delimiter){
        if(string.isEmpty()){
            return "";
        }
        if(delimiter.isEmpty()){
            return string;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length() - 1; i++) {
            char c = string.charAt(i);
            sb.append( c ).append(delimiter);
        }
        sb.append(string.charAt(string.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mix("We’re out of rum!", "-"));

        System.out.println(mix("Blimey", "\uD83D\uDC7B"));

        System.out.println(mix("HI", "♥"));

        System.out.println(mix("♥", "!!"));

        System.out.println(mix("", "👻"));
    }
}
