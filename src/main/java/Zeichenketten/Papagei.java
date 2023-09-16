package Zeichenketten;

public class Papagei {
    public static String abcz(char start, char end){
        int anzahl = end - start;
        if(anzahl < 0){
            char temp = start;
            start = end;
            end = temp;
        }
        StringBuilder result = new StringBuilder(Math.abs(anzahl) + 1);
        for (int i = 0; i < Math.abs(anzahl) + 1; i++) {
            char c = (char) (start + i);
            result.append(c).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(abcz('M','E'));
    }

}
