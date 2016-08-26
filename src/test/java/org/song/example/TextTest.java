package org.song.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextTest {
	
	Text text = new Text();
	
	@Test
    public void reverse() throws Exception{
        String expectedValue = "!dlrow olleH";
        String actualValue = text.reverse("Hello world!");
        Assert.assertEquals(actualValue, expectedValue);
    }

}
