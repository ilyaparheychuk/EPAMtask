package webdrivertest;

import by.epam.training.webdriver.PageHurtMePlenty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HurtMePlentyTest {

    WebDriver driver;
    PageHurtMePlenty page;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        page = new PageHurtMePlenty(driver);
        page.hurtMePlenty("Google Cloud Platform Pricing Calculator", "4");
    }

    @Test
    public void vmClassTest() {
        String expectResult = "VM class: regular";
        String realResult = driver.findElement(By.xpath("//*[@id=\'compute\']/md-list/md-list-item[2]/div")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @Test
    public void instanceTypeTest() {
        String expectResult = "Instance type: n1-standard-8";
        String realResult = driver.findElement(By.xpath("//*[@id=\'compute\']/md-list/md-list-item[3]/div")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @Test
    public void regionTest() {
        String expectResult = "Region: Frankfurt";
        String realResult = driver.findElement(By.xpath("//*[@id=\'compute\']/md-list/md-list-item[4]/div")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @Test
    public void localSSDTest() {
        String expectResult = "Total available local SSD space 2x375 GB";
        String realResult = driver.findElement(By.xpath("//*[@id=\'compute\']/md-list/md-list-item[5]/div")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @Test
    public void commitmentTermTest() {
        String expectResult = "Commitment term: 1 Year";
        String realResult = driver.findElement(By.xpath("//*[@id=\'compute\']/md-list/md-list-item[6]/div")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @Test
    public void totalCostTest() {
        String expectResult = "Total Estimated Cost: USD 1,082.77 per 1 month";
        String realResult = driver.findElement(By.xpath("//*[@id=\'resultBlock\']/md-card/md-card-content/div/div/div/h2/b")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
