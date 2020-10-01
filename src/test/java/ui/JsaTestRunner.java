package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.ChallengePO;
import pageobjects.HomePO;

public class JsaTestRunner {
    WebDriver driver;
    String baseUrl = "https://www.jamessmithacademy.com/";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void driverOff() {
        driver.quit();
    }

    protected HomePO welcome() {
        driver.get(baseUrl);
        return new HomePO(driver);
    }
}
