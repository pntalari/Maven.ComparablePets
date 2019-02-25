package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitTest {
    private Rabbit rabbitObj;

    @Before
    public void setup() {
        rabbitObj = new Rabbit(null);
    }

    @Test
    public void setNameTest() {
        //Given
        String expectedName = "Zuli";
        //When
        rabbitObj.setPetName(expectedName);
        //Then
        String actualName = rabbitObj.getPetName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        //Given
        String expectedSpeak = "Pitch!";
        //When
        String actualSpeak = rabbitObj.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void petInheritanceTest() {
        //Given
        boolean actualBool = false;
        //When
        actualBool = rabbitObj instanceof Pets;
        //Then
        Assert.assertTrue(actualBool);
    }

    @Test
    public void catConstructorTest() {
        //Given
        String expectedName = "Zuli";
        //When
        Cat catObj = new Cat(expectedName);
        String actualName = catObj.getPetName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}