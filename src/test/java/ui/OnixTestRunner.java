package ui;

import engine.OnixWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.ChallengePO;
import pageobjects.HomePO;

public class OnixTestRunner {
    protected OnixWebDriver driver;
    String baseUrl = "https://www.jamessmithacademy.com/";

    public OnixWebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        driver = new OnixWebDriver(chrome);
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
