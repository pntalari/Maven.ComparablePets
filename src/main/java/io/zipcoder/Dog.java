package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public class Dog extends Pets implements Comparable {

    public Dog(String petName) {
        super(petName);
    }

    public String speak()
    {
        return "Bark!";
    }

//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    public int compareTo(Object o) {
        return 0;
    }
}
