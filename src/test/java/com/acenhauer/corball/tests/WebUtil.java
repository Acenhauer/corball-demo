package com.acenhauer.corball.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by guillemhs on 2015-11-29.
 */
public class WebUtil {
    public static final int TIME_OUT_IN_SECONDS = 30;

    public static WebElement waitAndGetVisibleElement(RemoteWebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void inputKeysIntoElement(RemoteWebDriver driver, By locator, String keys) {
        WebElement element = WebUtil.waitAndGetVisibleElement(driver, locator);
        element.sendKeys(keys);
    }

    public static void click(RemoteWebDriver driver, By locator) {
        WebElement element = WebUtil.waitAndGetVisibleElement(driver, locator);
        element.click();
    }
}
