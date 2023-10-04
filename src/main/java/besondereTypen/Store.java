package besondereTypen;

import java.awt.*;
import java.util.*;
import java.util.List;

public record Store(String name, Point location) {

}

class StoreComparator{
    public static List<Store> findStoresAround(Collection<Store> stores, Point center){
        List<Store> result = new ArrayList<>(stores);
        class DistanceComparator implements Comparator<Store>{
            @Override
            public int compare(Store o1, Store o2) {
                return Double.compare(o1.location().distance(center), o2.location().distance(center));
            }
        }

        result.sort(new DistanceComparator());
        return result;
    }
    public static void main( String[] args ) {
        Store s1 = new Store( "ALDI",new  Point(10,10) );
        Store s2 = new Store( "LIDL", new  Point(90,80));
        Store s3 = new Store( "REWE", new  Point(51,51) );
        List<Store> list = Arrays.asList( s1, s2, s3 );
        System.out.println( list );
        List<Store> around = findStoresAround( list, new Point( 50, 50 ) );
        System.out.println( around );
    }
}