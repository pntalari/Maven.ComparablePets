package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    private Cat catObj;

    @Before
    public void setup() {
        catObj = new Cat(null);
    }

    @Test
    public void setNameTest() {
        //Given
        String expectedName = "Lori";
        //When
        catObj.setPetName(expectedName);
        //Then
        String actualName = catObj.getPetName();
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void speakTest(){
        //Given
        String expectedSpeak = "Meow!";
        //When
        String actualSpeak = catObj.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void petInheritanceTest(){
        //Given
        boolean actualBool = false;
        //When
        actualBool = catObj instanceof Pets;
        //Then
        Assert.assertTrue(actualBool);
    }

    @Test
    public void catConstructorTest(){
        //Given
        String expectedName = "Lori";
        //When
        Cat catObj = new Cat(expectedName);
        String actualName = catObj.getPetName();
        //Then
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void compareTo() {
    }
}