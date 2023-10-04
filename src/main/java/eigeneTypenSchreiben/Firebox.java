package eigeneTypenSchreiben;

public class Firebox extends ElectronicDevice{
    public Firebox(){
        on();
    }

    @Override
    public void off() {
        System.out.println("Kann nicht ausgeschaltet werden!");
    }

    public static void main(String[] args) {
        Firebox fb = new Firebox();
        System.out.println( fb.isOn() );  // true
        fb.off();
        System.out.println( fb.isOn() );  // true
    }
}
