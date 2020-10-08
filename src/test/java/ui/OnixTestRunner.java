package ui;

import engine.OnixWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.MainPO;

import java.util.concurrent.TimeUnit;

public class OnixTestRunner {
    protected OnixWebDriver driver;
//    String baseUrl = "http://127.0.0.1:8000/";
    String baseUrl = "https://www.jamessmithacademy.com/";
//    String baseUrl = "https://testing-jamessmith-academy.herokuapp.com/";

    public OnixWebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver = new OnixWebDriver(chrome);
    }

    @AfterClass
    public void driverOff() {
        driver.quit();
    }

    protected MainPO welcome() {
        driver.get(baseUrl);
        return new MainPO(driver);
    }
}
