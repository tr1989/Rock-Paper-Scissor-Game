package com.rps;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rtulya on 11/29/2016.
 */
public class UserInputCollectorTest {
    @Test
    public void inputValidatorPassTest(){
        UserInputCollector userInputCollector = new UserInputCollector("E", "R");
        boolean actual = true;
        boolean expected =  userInputCollector.isInputValid("R");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void inputValidatorFailTest(){
        UserInputCollector userInputCollector = new UserInputCollector("E", "R");
        boolean actual = false;
        boolean expected =  userInputCollector.isInputValid("E");
        Assert.assertEquals(actual, expected);
    }
}