package Arrays;

public class BergeZeichnen {
    public static void printMountain(int[] altitudes) {
        int maxAltitude = altitudes[0];

        for (int altitude : altitudes) {
            if(altitude > maxAltitude){
                maxAltitude = altitude;
            }
        }
// Wieso funktioniert das nicht?
//        for (int i = maxAltitude; i >= 0; i--) {
//            System.out.print(i + " ");
//
//            for (int altitude: altitudes) {
//                if(altitude == i){
//                    System.out.print(printGradient(altitudes,i));
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for ( int height = maxAltitude; height >= 0; height-- ) {
            System.out.print( height + " " );
            for ( int x = 0; x < altitudes.length; x++ )
                System.out.print( altitudes[ x ] == height ?
                        printGradient( altitudes, x ) : ' ' );
            System.out.println();
        }
    }

    public static char printGradient(int[] altitudes, int index) {
        if(index > altitudes.length || altitudes.length < 2){
            return '*';
        }
        int previous = index == 0 ? 0 : altitudes[index - 1];
        int current = altitudes[index];
        int next = index < altitudes.length - 1 ? altitudes[index + 1] : -1;
        if(current > previous && current > next){
            return '^';
        }
        if(current < next) {
            return '/';
        }
        if(current > next){
            return '\\';
        }
        return '-';
    }


    public static void main(String[] args) {
        int[] mountain = { 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0 };
        printMountain(mountain);
    }
}
