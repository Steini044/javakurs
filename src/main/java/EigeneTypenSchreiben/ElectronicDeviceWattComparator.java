package EigeneTypenSchreiben;

public class ElectronicDeviceWattComparator implements java.util.Comparator<ElectronicDevice>{

    @Override
    public int compare(ElectronicDevice o1, ElectronicDevice o2) {
        System.out.println(o1 + " wird verglichen mit " + o2);
        return (Integer.compare(o1.getWatt(), o2.getWatt()));
    }
}
