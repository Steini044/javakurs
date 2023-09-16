package Zeichenketten;

public class WordWrap {
    public static String wrap(String string, int width){
        if(string.length() <= width){
            return string;
        }

        String returnString = "";
        int space = 0;
        int lastSpace = 0;
        for (int i = width; i < string.length(); i+= width){
            space = string.lastIndexOf(" ", i);
            if(space == -1){
                space = i + width;
            }
            returnString += string.substring(lastSpace, space) + "\n";
            i = space + 1;
            lastSpace = space + 1;
        }
        return returnString + string.substring(space + 1);
    }

    public static void main(String[] args) {
        String s = "Live now; make now always the most precious time. "
                + "Now will never come again.";
        System.out.println( wrap( s, 30 ) );
    }
}
