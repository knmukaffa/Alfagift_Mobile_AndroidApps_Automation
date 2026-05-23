package org.example.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() {

        try {

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("deviceName", "Galaxy A11"); // Change based on your device name
            caps.setCapability("udid", "R9RN7068Z3X"); // Change based on your device UDID
            caps.setCapability("appPackage", "com.alfamart.alfagift");

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723/"),
                    caps
            );

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            throw new RuntimeException("Failed initialize driver: " + e.getMessage());
        }
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
        }
    }
}
