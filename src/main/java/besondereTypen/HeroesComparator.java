package besondereTypen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeroesComparator {
    public static void main(String[] args) {
        //local class
        class FirstAppearanceComparator implements Comparator<Heroes.Hero> {

            @Override
            public int compare(Heroes.Hero o1, Heroes.Hero o2) {
                return Integer.compare(o1.yearFirstAppearance(), o2.yearFirstAppearance());
            }
        }

        //inner anonymous class
        Comparator<Heroes.Hero> innerClassComparator = new Comparator<Heroes.Hero>() {
            @Override
            public int compare(Heroes.Hero o1, Heroes.Hero o2) {
                return Integer.compare(o1.yearFirstAppearance(), o2.yearFirstAppearance());
            }
        };

        //Comparator with 2 criteria
        Comparator<Heroes.Hero> twoCriteriaComparator = new Comparator<Heroes.Hero>() {
            @Override
            public int compare(Heroes.Hero o1, Heroes.Hero o2) {
                int firstAppearance = Integer.compare(o1.yearFirstAppearance(), o2.yearFirstAppearance());
                return firstAppearance != 0 ? firstAppearance : o1.name().compareTo(o1.name());
            }
        };

        List<Heroes.Hero> allHeroes = new ArrayList<>(Heroes.ALL);
        System.out.println(allHeroes);
        allHeroes.sort(new FirstAppearanceComparator());
        System.out.println(allHeroes);
        allHeroes.sort(innerClassComparator);
        System.out.println(allHeroes);
        allHeroes.sort(twoCriteriaComparator);
        System.out.println(allHeroes);
    }

}
