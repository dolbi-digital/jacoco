package org.song.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
	
	Calc calc = new Calc();

    @Test
    public void addition() throws Exception{
        int expectedValue = 8;       
        int actualValue = calc.add(3, 5);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void subtraction() throws Exception{
        int expectedValue = -2;
        int actualValue = calc.sub(3, 5);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void multiplication() throws Exception{
        int expectedValue = 15;
        int actualValue = calc.mul(3, 5);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void division() throws Exception{
        int expectedValue = 0;
        int actualValue = calc.div(3, 5);
        Assert.assertEquals(actualValue, expectedValue);
    }

}
