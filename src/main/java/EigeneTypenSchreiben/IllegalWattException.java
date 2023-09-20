package EigeneTypenSchreiben;

public class IllegalWattException extends RuntimeException{
    public IllegalWattException(){

    }

    public IllegalWattException(String format, Object... args){
        super(String.format(format, args));
    }
}
