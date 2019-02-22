package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PetSorter<Pets>{

    List<Pets> pet = new ArrayList<Pets>();

    public PetSorter(List<Pets> pet){
        this.pet = pet;
    }

    public PetSorter()
    {
        this.pet = Collections.emptyList();
    }

    public List<Pets> sort(Comparator<Pets> comparator){
        Collections.sort(this.pet,comparator);
        return pet;
    }


}
