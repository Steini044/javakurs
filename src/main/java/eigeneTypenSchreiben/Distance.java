package eigeneTypenSchreiben;

public interface Distance {
    public static Distance ofMeter(int value){
        return new DistanceImplementation(value);
    }

    public static Distance ofKilometer(int value){
        return new DistanceImplementation(value * 1000);
    }

    abstract int meter();

    default int kilometer(){
        return meter() / 1000;
    }
}
