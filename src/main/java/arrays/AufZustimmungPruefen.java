package arrays;

public class AufZustimmungPruefen {
    public static boolean allTrue(boolean firstBoolean, boolean ... booleans){
        if(booleans == null){
            System.out.println("Fehler es wurde null übergeben");
            return false;
        }
        if(booleans.length == 0){
            return firstBoolean;
        }
        if(firstBoolean == false){
            return false;
        }
        for(boolean bool : booleans){
            if (bool == false){
                return false;
            }
        }
        return firstBoolean;
    }

    public static void main(String[] args) {
        System.out.println(allTrue(true, true, true));
        System.out.println(allTrue(true));
        System.out.println(allTrue(true, false));
        System.out.println(allTrue(true, null));
        //System.out.println(allTrue());
    }
}
