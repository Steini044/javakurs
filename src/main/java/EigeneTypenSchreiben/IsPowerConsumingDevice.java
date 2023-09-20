package EigeneTypenSchreiben;

import java.util.function.Predicate;

public class IsPowerConsumingDevice implements Predicate<ElectronicDevice> {

    private final static int MAXIMUM_POWER_CONSUMPTION = 1000;

    @Override
    public boolean test(ElectronicDevice device) {
        return (device.getWatt() > MAXIMUM_POWER_CONSUMPTION);
    }
}
