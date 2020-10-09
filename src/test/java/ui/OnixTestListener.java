package ui;

import engine.OnixWebDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ui.negative.RandomBugsCatcher;

public class OnixTestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getTestContext().getName());
        ITestContext context = result.getTestContext();
        Object o = context.getAttribute("driver");
        System.out.println(o);
        Object i = result.getInstance();

        saveScreenshotPNG(((RandomBugsCatcher) i).driver.getSeleniumDriver());
    }
    @Override
    public void onTestSkipped(ITestResult result) {

    }

    private void takeScreenShort(ITestResult result) {

    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
