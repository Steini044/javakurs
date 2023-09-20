package Zeichenketten;

public class PrintUnderline {
    public static void printUnderline(String string, String search){
        int searchLength = search.length();
        StringBuilder sb = new StringBuilder(string.toLowerCase());
        StringBuilder result = new StringBuilder();
        int index = sb.indexOf(search.toLowerCase());
        int startIndex = 0;
        while(index >= 0){
            result.append(" ".repeat(index - startIndex));
            result.append("-".repeat(searchLength));
            startIndex = index + searchLength;
            index = sb.indexOf(search.toLowerCase(),startIndex);
        }
        System.out.println(string);
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        printUnderline("There is more treasure in books than in all the pirates' loot on Treasure Island", "Treasure");
    }
}