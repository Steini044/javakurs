package EigeneTypenSchreiben;

public class ElectronicDevice {
    protected boolean isOn;
    private int watt;

    public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... devices) {
        int result = 0;
        for (ElectronicDevice device : devices) {
            if (device.isOn) {
                result++;
            }
        }
        return result;
    }

    public void setWatt(int watt) {
        if(watt <= 0){
            throw new IllegalWattException("Watt darf nicht 0 oder Negativ sein!");
        }
        this.watt = watt;
    }

    public int getWatt() {
        return watt;
    }

    public void on() {
        isOn = true;
        System.out.println("an");
    }

    public void off() {
        isOn = false;
        System.out.println("aus");
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "ElectronicDevice[" +
                "is " + (isOn ? "on" : "off") +
                ", watt=" + watt / 1000 + "kW";
    }
}
