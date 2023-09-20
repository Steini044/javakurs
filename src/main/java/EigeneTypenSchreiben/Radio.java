package EigeneTypenSchreiben;

public class Radio extends ElectronicDevice{
    public static final String WALKING_THE_PLANK = "Walking the Plank";
    public static final double WALKING_THE_PLANK_FREQUENCY = 98.3;
    public static final String BFBS = "BFBS";
    public static final double BFBS_FREQUENCY = 102.;

    private int volume;
    private double frequency;

    private Modulation modulation = Modulation.AM;

    public Modulation getModulation() {
        return modulation;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = modulation;
    }

    public static double stationNameToFrequency(String stationName){
        return (switch(stationName){
            case WALKING_THE_PLANK -> WALKING_THE_PLANK_FREQUENCY;
            case BFBS -> BFBS_FREQUENCY;
            default -> 0.0;
        });
    }

    public Radio(){

    }

    public Radio(double frequency){
        setFrequency(frequency);
    }

    public Radio(String stationName){
        this(stationNameToFrequency(stationName));
    }

    public Radio(Radio r1){
        setFrequency(r1.getFrequency());
        setModulation(r1.getModulation());
        if(r1.isOn()){
            on();
        } else {
            off();
        }
        this.volume = r1.getVolume();
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getVolume() {
        return volume;
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", volume=" + volume +
                ", frequency=" + frequency +
                ", modulation=" + modulation +
                "]";
    }
}
