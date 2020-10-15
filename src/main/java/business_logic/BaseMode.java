package business_logic;

import engine.OnixWebDriver;

public interface BaseMode {
    String baseUrl = "https://www.jamessmithacademy.com/";
    OnixWebDriver getDriver();
}
