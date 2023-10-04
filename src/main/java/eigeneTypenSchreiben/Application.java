package eigeneTypenSchreiben;

import java.util.Comparator;

public class Application {
    static class ElectronicDeviceWattComparator
            implements Comparator<ElectronicDevice> {
        @Override public int compare( ElectronicDevice o1,
                                      ElectronicDevice o2 ) {
            return Double.compare( o1.getWatt(), o2.getWatt() );
        }
    public static void main(String[] args) {
        class ElectronicDeviceWattComparator2
                implements Comparator<ElectronicDevice> {
            @Override public int compare( ElectronicDevice o1,
                                          ElectronicDevice o2 ) {
                return Double.compare( o1.getWatt(), o2.getWatt() );
            }
        }

        Comparator<ElectronicDevice> wattComparator = new Comparator<ElectronicDevice>() {
            @Override
            public int compare(ElectronicDevice o1, ElectronicDevice o2) {
                return Double.compare( o1.getWatt(), o2.getWatt() );
            }
        };
        Radio grandmasOldRadio = new Radio();
        System.out.println( grandmasOldRadio.isOn() );     // false
        grandmasOldRadio.on();
        System.out.println( grandmasOldRadio.isOn() );     // true
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeDown();
        grandmasOldRadio.volumeUp();
        System.out.println( grandmasOldRadio.toString() ); // Radio[volume=2, is on]
        System.out.println( grandmasOldRadio );            // Radio[volume=2, is on]
        System.out.println( Radio.stationNameToFrequency( "Walking the Plank" ) ); // 98.3
        Radio r1 = new Radio();
        Radio r2 = new Radio( 102. );
        Radio r3 = new Radio( "BFBS" );

        TV Tv = new TV();
        Ship blackPearl = new Ship();
        Ship hmsInterceptor = new Ship();
        blackPearl.load(r1);
        blackPearl.load(r2);
        blackPearl.load(r3);
        System.out.println(blackPearl.toString());
        IceMachine ice = new IceMachine();

        r2.on();
        int switchedOn =
                ElectronicDevice.numberOfElectronicDevicesSwitchedOn( grandmasOldRadio, ice, r1, r2);
        System.out.println( switchedOn );

        Radio bedroomRadio = new Radio();
        bedroomRadio.volumeUp();
        Radio cabooseRadio = new Radio();
        cabooseRadio.volumeUp();
        TV mainTv = new TV();
        Radio crRadio = new Radio();
        Firebox alarm = new Firebox();
        Ship ship = new Ship();
        ship.load( bedroomRadio );
        ship.load( cabooseRadio );
        ship.load( mainTv );
        ship.load( crRadio );
        ship.load( alarm );
        ship.holiday();

        Radio grannysRadio = new Radio();
        grannysRadio.volumeUp();
        grannysRadio.setWatt( 12_000 );

        TV grandpasTv = new TV();
        grandpasTv.setWatt( 1000 );

        Ship Empress = new Ship();
        Empress.load( grannysRadio );
        Empress.load( grandpasTv );
        System.out.println( Empress.findMostPowerConsumingElectronicDevice().getWatt() );

        ElectronicDevice Tester = new ElectronicDevice();
        try {
            Tester.setWatt(0);
        } catch(IllegalWattException e) {
            e.printStackTrace();
        }
    }
    }
}
