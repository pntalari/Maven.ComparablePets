package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public class Cat extends Pets implements Comparable {

    public Cat(String petName) {
        super(petName);
    }

    public String speak()
    {
        return "Meow!";
    }

//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    public int compareTo(Object o) {
        return 0;
    }
}
