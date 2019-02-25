package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PetSorter<Pets>{

    ArrayList<Pets> pet = new ArrayList<Pets>();

    public PetSorter(ArrayList<Pets> pet){
        this.pet = pet;
    }

    public PetSorter()
    {

    }

    public ArrayList<Pets> sort(Comparator<Pets> comparator){
        Collections.sort(this.pet,comparator);
        return pet;
    }


}
