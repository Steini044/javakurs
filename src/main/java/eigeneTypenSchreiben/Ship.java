package eigeneTypenSchreiben;

import static java.util.Collections.max;
import java.util.ArrayList;


public class Ship{
    private final ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
    private final static ElectronicDeviceWattComparator ELECTRONIC_DEVICE_WATT_COMPARATOR = new  ElectronicDeviceWattComparator();

    public void load(ElectronicDevice device){
        if (device instanceof Radio) {
            if(((Radio) device).getVolume() == 0){
                return;
            }
            System.out.println("Remember to pay license fee!");
        }
        devices.add(device);
        devices.sort(ELECTRONIC_DEVICE_WATT_COMPARATOR);
    }

    public void removePowerConsumingElectronicDevices(){
        devices.removeIf(new IsPowerConsumingDevice());
    }

    public int countDevicesSwitchedOn(){
        int result = 0;
        for (ElectronicDevice device : devices) {
            if(device.isOn()){
                result++;
            }
        }
        return result;
    }

    public void holiday(){
        for (ElectronicDevice device : devices) {
            device.off();
        }
    }

    public ElectronicDevice findMostPowerConsumingElectronicDevice(){
        return max(devices, ELECTRONIC_DEVICE_WATT_COMPARATOR);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "radios=" + devices +
                '}';
    }
}
