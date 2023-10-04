package eigeneTypenSchreiben;

public class MonitorTube {

    private final TV tv;
    public MonitorTube(TV tv){
        this.tv = tv;
    }
    public void on(){
        System.out.println("Bildröhre wurde eingeschaltet");
    }
    public void off(){
        System.out.println("Bildröhre wurde ausgeschaltet");
    }
}
