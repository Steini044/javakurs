package Zeichenketten;

public class Leerzeichen {
    public static StringBuilder compressSpace(StringBuilder string){
        if(string.length() < 2){
            return string;
        }
        for (int i = string.length() - 1; i > 1; i--) {
            if(string.charAt(i) == ' ' && string.charAt(i - 1) == ' '){
                string.deleteCharAt(i);
            }
        }
        return string;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Will  you shut up,  man!   This is the way!");
        System.out.println(compressSpace(sb).toString());
    }
}
