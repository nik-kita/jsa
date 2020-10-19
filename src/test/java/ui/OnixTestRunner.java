package ui;

import business_logic.BaseMode;
import engine.OnixWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.MainPO;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class OnixTestRunner {
    public OnixWebDriver driver;
    protected MainPO mainPO;
    String baseUrl = BaseMode.baseUrl;

    public OnixWebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver = new OnixWebDriver(chrome);
    }

    @AfterClass
    public void driverOff() {
        driver.quit();
    }

    protected MainPO openSite() {
        driver.get(baseUrl);
        mainPO = new MainPO(driver);
        return mainPO;
    }

    public Object[] mergeArrays(Object[]...arrays) {
        int length = 0;
        for (Object[] array : arrays) {
            length += array.length;
        }
        Object[] result = new Object[length];
        int pos = 0;
        for (Object[] array : arrays) {
            for (Object e : array) {
                result[pos] = e;
                pos++;
            }
        }
        return result;
    }
}
