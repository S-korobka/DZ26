package org.example.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotUtils {

    public ScreenshotUtils() {
    }

    public static File getScreenshot(WebDriver driver) {
TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
return takesScreenshot.getScreenshotAs(OutputType.FILE);
    }
}
