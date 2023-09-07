package ForSchleifen;

public class FlaggeErstellen {
    public static void main(String[] args) {
        int groesse = 10;
        for (int i = 1; i <= groesse; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%d ", i);
            }
            System.out.printf("%n");
        }

        for ( int i = 1; i <= groesse; i++ ) {
            for ( int indent = 0; indent < (groesse - i); indent++ )
                System.out.print( " " );

            for ( int j = 1; j <= i; j++ )
                System.out.print( i + " " );

            System.out.println();
        }
    }
}
