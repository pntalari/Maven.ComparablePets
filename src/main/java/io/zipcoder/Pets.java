package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pets {

    String petName;
    private List<Pets> petList;

    public Pets(){
        petName = "";
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

//    public Pets[] getPets(){
//
//    }

}
