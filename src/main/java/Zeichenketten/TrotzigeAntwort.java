package Zeichenketten;

public class TrotzigeAntwort {

    public static void trotzigeAntwort(String string){
        if(string.equalsIgnoreCase("no idea?")){
            System.out.println("Aye!");
        } else if(string.endsWith("?")) {
            System.out.println(string.concat(" No idea!"));
        }
    }

    public static void main(String[] args) {
        String string = new java.util.Scanner(System.in).nextLine();
        trotzigeAntwort(string);
    }
}
