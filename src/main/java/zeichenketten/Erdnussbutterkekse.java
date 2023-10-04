package zeichenketten;

public class Erdnussbutterkekse {
    public static int moeglicheKeksAnzahl(String zutaten){
        if(zutaten.length() < 3){
            return 0;
        }

        int result = 0;
        for (int i = 0; i < zutaten.length() - 2; i++) {
            String triplet = zutaten.substring(i, i + 3);
            if(containsZutaten(triplet)){
                result++;
                i += 2;
            }
        }
        return result;
    }

    //Always expect a String with length == 3
    private static boolean containsZutaten(String triplet) {
        boolean containsS = triplet.contains("S");
        boolean containsE = triplet.contains("E");
        boolean containsP = triplet.contains("P");
        return containsP && containsE && containsS;
    }

    public static void main(String[] args) {
        System.out.println(moeglicheKeksAnzahl("PSESPEPEPSHFSPEPPES"));
    }
}
