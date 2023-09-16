package Zeichenketten;

public class BiggerCrew {
    public static void printCrewDifference(String raid){
        int split = raid.indexOf('-');
        if(split < 0){
            System.out.println("Error sperator is missing!");
            return;
        }
        int ownCrew = split;
        int enemyCrew = raid.substring(split + 1).length();
        if(ownCrew > enemyCrew){
            System.out.printf("Pirate ship had a larger crew, difference %d%n", ownCrew - enemyCrew);
        } else if (enemyCrew > ownCrew) {
            System.out.printf("Raided ship had a larger crew, difference %d%n", enemyCrew - ownCrew);
        } else {
            System.out.println("Ships had the same crew size");
        }
    }

    public static void main(String[] args) {
        printCrewDifference("|-|||");
        printCrewDifference("||-||");
        printCrewDifference("||-|||||");
    }
}
