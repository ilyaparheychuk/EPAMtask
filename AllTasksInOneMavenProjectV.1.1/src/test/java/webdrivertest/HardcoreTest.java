package webdrivertest;

import by.epam.training.webdriver.PageHardcore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardcoreTest {

    WebDriver driver;
    PageHardcore page;

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        page = new PageHardcore(driver);
        page.hardcore("Google Cloud Platform Pricing Calculator", "4");
    }

    @Test
    public void hardcoreTest() {
        WebElement minuteMail = driver.findElement(By.xpath("//*[@id=\'mobilepadding\']/td/h2"));
        String textInMinuteMail = minuteMail.getText();
        driver.switchTo().window("");
        WebElement googleCalculate = driver.findElement(By.xpath("//*[@id=\'resultBlock\']/md-card/md-card-content/div/div/div/h2/b"));
        String textInGoogleCalculate = googleCalculate.getText();
        String realResult = textInMinuteMail.substring(28, 36);
        String expectResult = textInGoogleCalculate.substring(26, 34);
        Assert.assertEquals(expectResult, realResult);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
