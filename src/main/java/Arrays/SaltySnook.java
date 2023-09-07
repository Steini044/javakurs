package Arrays;

public class SaltySnook {
    public static void main(String[] args) {
        String[] signs1 = { "F", "DO", "MOS", "MOS", "MOS", "MOS", "WES" };
        System.out.println( isProbablyApproaching( signs1 ) );   // true

        String[] signs2 = { "F", "DO", "MOS", "MOS", "WES", "MOS", "MOS" };
        System.out.println( isProbablyApproaching( signs2 ) );  // false
    }
    
    public static boolean isProbablyApproaching(String[] signs){
        if(signs.length < 4)
            return false;

        int counter = 0;
        for (int i = 0; i < signs.length - 1; i++) {
            if (signs[i].equals(signs[i + 1])) {
                counter += 1;
                if (counter == 3)
                    return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }
}
