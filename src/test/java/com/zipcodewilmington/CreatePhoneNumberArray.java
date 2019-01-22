package com.zipcodewilmington;

import com.zipcodewilmington.phone.PhoneNumber;
import com.zipcodewilmington.phone.PhoneNumberFactory;
import org.junit.Assert;
import org.junit.Test;

public class CreatePhoneNumberArray {

    @Test
    public void testCreateRandomPhoneNumberArrayCorrectLength() {

        //Given
        PhoneNumber[] phoneNumbers = PhoneNumberFactory.createRandomPhoneNumberArray(5);

        //When
        int expected = 5;
        int actual = phoneNumbers.length;

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCreateRandomPhoneNumberArrayNotNull() {

        //Given
        PhoneNumber [] phoneNumbers = PhoneNumberFactory.createRandomPhoneNumberArray(5);

        //Then
        Assert.assertTrue(phoneNumbers[0] != null);
    }
    @Test
    public void testCreateRandomPhoneNumberArrayCorrectFormat()  {

        //Given
        PhoneNumber [] phoneNumbers = PhoneNumberFactory.createRandomPhoneNumberArray(5);

        //Then
        Assert.assertTrue(phoneNumbers[0].toString().matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"));
    }

}
