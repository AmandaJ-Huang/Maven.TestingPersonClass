package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFemale() {
        //Given
        Person person = new Person();
        Boolean expected = false;

        //When
        person.setFemale(expected);
        Boolean actual = person.getFemale();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMiddleName() {
        //Given
        Person person = new Person();
        Character expected = 'J';

        //When
        person.setMiddleName(expected);
        Character actual = person.getMiddleName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthYear() {
        //Given
        Person person = new Person();
        Integer expected = 1994;

        //When
        person.setBirthYear(expected);
        Integer actual = person.getBirthYear();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPetName() {
        //Given
        Person person = new Person();
        String expected = "Stella";

        //When
        person.setPetName(expected);
        String actual = person.getPetName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClothesSize() {
        //Given
        Person person = new Person();
        int expected = 2;

        //When
        person.setClothesSize(expected);
        int actual = person.getClothesSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
