package Zeichenketten;

public class InMiddle {
    public static boolean isCiaoCiaoInMiddle(String string){
        if(string.length() % 2 != 0 || string.length() < 8){
            return false;
        }
        int middle = string.length() / 2;
        if(string.regionMatches(middle - 4, "CiaoCiao",0,8)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCiaoCiaoInMiddle("CiaoCiao"));
        System.out.println(isCiaoCiaoInMiddle("!CiaoCiao!"));
        System.out.println(isCiaoCiaoInMiddle("x!_CiaoCiaoabc"));
        System.out.println(isCiaoCiaoInMiddle("\tCiaoCiao "));
        System.out.println(isCiaoCiaoInMiddle("BambooCiaoCiaoBlop"));
        System.out.println(isCiaoCiaoInMiddle("Bernie und Ert"));
    }
}
