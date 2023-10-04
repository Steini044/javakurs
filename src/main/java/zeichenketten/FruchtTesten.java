package zeichenketten;

public class FruchtTesten {
    public static boolean checkChocolate(String choco){
        if(choco.length() % 2 == 0){
            return false;
        }
        if(choco.length() == 3){
            return choco.equals("hFh") || choco.equals("dFd");
        }

        String nextLayer = choco.substring(1,choco.length() - 1);
        return (checkChocolate(nextLayer) && (choco.charAt(0) == choco.charAt(choco.length()-1)));
    }

    public static void main(String[] args) {
        System.out.println(checkChocolate("ddhFhdd"));
    }
}
