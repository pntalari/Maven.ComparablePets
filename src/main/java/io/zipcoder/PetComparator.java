package io.zipcoder;
import io.zipcoder.Pets;
import java.util.Comparator;

public class PetComparator implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {

    return o1.getPetType().compareTo(o2.getPetType());
    }
}
