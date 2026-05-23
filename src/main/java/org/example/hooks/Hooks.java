package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.drivers.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initializeDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
