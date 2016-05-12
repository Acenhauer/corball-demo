package com.acenhauer.corball.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.acenhauer.corball.appium.MobileApp;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IOSTest extends MobileApp {

    private List<Integer> values;

    private static final int MINIMUM = 0;
    private static final int MAXIMUM = 10;

    private void populate() {
        values = new ArrayList<Integer>();
        //populate text fields with two random number
        List<WebElement> elems = driver().findElementsByClassName("UIATextField");
        Random random = new Random();
        for (WebElement elem : elems) {
            int rndNum = random.nextInt(MAXIMUM - MINIMUM + 1) + MINIMUM;
            elem.sendKeys(String.valueOf(rndNum));
            values.add(rndNum);
        }
    }

    @Test
    public void testUIComputation() throws Exception {

        // populate text fields with values
        populate();
        // trigger computation by using the button
        WebElement button = driver().findElementByClassName("UIAButton");
        button.click();
        // is sum equal ?
        WebElement texts = driver().findElementByClassName("UIAStaticText");
        assertEquals(String.valueOf(values.get(0) + values.get(1)), texts.getText());
    }
}
