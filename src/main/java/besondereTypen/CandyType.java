package besondereTypen;

import java.util.Optional;
import java.util.Scanner;

public enum CandyType {
    CARAMELS(9), CHOCOLATE(5), GUMMIES(4), LICORICE(3),
    LOLLIPOPS(2), CHEWING_GUMS(3), COTTON_CANDY(1);

    private final int addictiveQuality;
    CandyType(int addictiveQuality) {
        this.addictiveQuality = addictiveQuality;
    }

    public int addictiveQuality(){
        return this.addictiveQuality;
    }

    public CandyType next(){
        return switch ( this ) {
            case GUMMIES -> CHOCOLATE;
            case LOLLIPOPS -> Math.random() > 0.5 ? LICORICE : CHEWING_GUMS;
            case COTTON_CANDY -> LOLLIPOPS;
            case LICORICE, CHEWING_GUMS -> GUMMIES;
            default -> CARAMELS;
        };
    }
    public static Optional<CandyType> fromName(String input){
        try{
            input = input.trim().toUpperCase().replace( ' ', '_' );
            return Optional.of(CandyType.valueOf(input));
        } catch( IllegalArgumentException e){
            return Optional.empty();
        }
    }

    public static CandyType random(){
        return values()[(int) (Math.random() * values().length)];
    }
}
class AskCandy {
    public static void main(String[] args) {
        System.out.println( "Name a candy" );
        String input = new Scanner( System.in ).nextLine();
        CandyType.fromName( input ).ifPresentOrElse( System.out::println,
                () -> System.out.println("Unknown") );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
        System.out.println( CandyType.random() );
    }
}
