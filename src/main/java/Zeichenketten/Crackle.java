package Zeichenketten;

public class Crackle {
    public static String crackle(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(0.1 > Math.random()){
                result.append("♬CRACK♪").append(string.charAt(i));
            } else {
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }

    public static String decrackle(String string){
        StringBuilder result = new StringBuilder(string);
        String crackle = "♬CRACK♪";
        int index = result.indexOf(crackle);
        while(index > 0){
            result.delete(index,index + crackle.length());
            index = result.indexOf(crackle);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String crackledString = crackle("Hallo ich crackle!");
        System.out.println(crackledString);
        System.out.println(decrackle(crackledString));

    }

}
