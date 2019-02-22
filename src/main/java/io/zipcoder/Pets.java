package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.lang.Comparable;

public class Pets implements Comparator<Pets> {

    String petName;
    String petType;
    private List<Pets> petList;

    public Pets(){
        petName = "";
        petType = "";
    }

    public Pets(String type,String name ){
        super();
        this.petName = name;
        this.petType = type;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String type) {
        this.petType = type;
    }

    public Pets(String petName,Pets... pets) {
        this.petName = petName;
        if (pets == null)
            this.petList = new ArrayList<Pets>();
        else {
            this.petList = new ArrayList<Pets>(Arrays.asList(pets));

            for (int i = 0; i < pets.length; i++) {
                Pets pet = pets[i];
            }
        }
    }

    public String speak(){
        return null;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int compare(Pets o1, Pets o2) {
        return o1.getPetType().compareTo(o2.getPetType());
    }

    public int compareTo(Pets o) {
        return this.petType.compareTo(o.getPetType());
    }
}
