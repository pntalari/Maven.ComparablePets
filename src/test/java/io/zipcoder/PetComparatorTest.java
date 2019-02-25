package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Arrays.asList;

import static org.junit.Assert.*;

public class PetComparatorTest {

    @Test
    public void compareByTypeTest() {
        //Given
        Pets pet1 = new Pets( "Dog","Pummy");
        Pets pet2 = new Pets( "Rabbit","Zuli");
        Pets pet3 = new Pets("Cat","Lori");
        ArrayList<Pets> petsToSort = new ArrayList<Pets>();
        petsToSort.add(pet1);
        petsToSort.add(pet2);
        petsToSort.add(pet3);
        ArrayList<Pets> expected = new ArrayList<Pets>();
        expected.add(pet3);
        expected.add(pet1);
        expected.add(pet2);
        PetSorter petSorter = new PetSorter(petsToSort);
        Comparator<Pets> comparator = (Comparator<Pets>) new PetComparator();
        //When
        ArrayList<Pets> actual = petSorter.sort(comparator);
        //Then
        Assert.assertTrue(expected.equals(actual));
    }
}