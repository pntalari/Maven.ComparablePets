package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    private Dog dogObj;

    @Before
    public void setup() {
        dogObj = new Dog(null);
    }

    @Test
    public void setNameTest() {
        //Given
        String expectedName = "Pummy";
        //When
        dogObj.setPetName(expectedName);
        //Then
        String actualName = dogObj.getPetName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        //Given
        String expectedSpeak = "Bark!";
        //When
        String actualSpeak = dogObj.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void petInheritanceTest() {
        //Given
        boolean actualBool = false;
        //When
        actualBool = dogObj instanceof Pets;
        //Then
        Assert.assertTrue(actualBool);
    }

    @Test
    public void catConstructorTest() {
        //Given
        String expectedName = "Pummy";
        //When
        Cat catObj = new Cat(expectedName);
        String actualName = catObj.getPetName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}