package eigeneTypenSchreiben;

public class TV extends ElectronicDevice{
    private final MonitorTube monitorTube = new MonitorTube(this);

    public TV(){

    }
    public void on(){
        super.on();
        System.out.println("Fernseher wurde eingeschaltet");
        this.monitorTube.on();
    }
    public void off(){
        super.off();
        System.out.println("Fernseher wurde ausgeschaltet");
        this.monitorTube.off();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", monitorTube=" + monitorTube +
                '}';
    }

    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        System.out.println(tv.isOn);
        tv.off();
        System.out.println(tv.isOn);
    }
}
