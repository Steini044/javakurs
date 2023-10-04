package zeichenketten;

public class ShortestName {
    public static String shortestName(String ... names){
        if(names.length == 0){
            return "";
        }
        String shortestName = names[0];

        for (String name: names) {
            int space = name.indexOf(' ');
            if(space < 0){
                shortestName = shortest(shortestName, name);
            } else {
                String name1 = name.substring(0, space);
                String name2 = name.substring(space +1);
                shortestName = shortest(shortestName,(shortest(name1, name2)));
            }
        }
        return shortestName;
    }

    public static String shortest(String a, String b){
        return a.length() < b.length() ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(shortestName("Albert Tross","Blowfish","Nick Olaus","Jo Ker"));
    }
}
