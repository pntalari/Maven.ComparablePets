package io.zipcoder;
import java.util.Comparator;

public class Rabbit extends Pets implements Comparable {

    public Rabbit(String petName) {
        super(petName);
    }

    public String speak()
    {
        return "Pitch!";
    }

//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    public int compareTo(Object o) {
        return 0;
    }
}
