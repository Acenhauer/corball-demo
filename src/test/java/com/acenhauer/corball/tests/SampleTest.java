package com.acenhauer.corball.tests;

import com.acenhauer.corball.appium.MobileBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guillemhs on 2015-11-16.
 */
public class SampleTest extends MobileBase {
    /**
     * please run this test to make sure environment has been setup correctly
     */
    @Test
    public void firstTest() {
        driver().get("http://google.com");
        Assert.assertEquals("Google", "Google", driver().getTitle());
    }
}
