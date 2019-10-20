package webdrivertest;

import by.epam.training.webdriver.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BringItOnTest {

    WebDriver driver;
    Page page;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        page = new Page(driver);
        page.bringItOn("git config --global user.name  \"New Sheriff in Town\""
                        + "\n" + "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")"
                        + "\n" + "git push origin master --force"
                , "how to gain dominance among developers");
    }

    @Test
    public void titleIsTrueTest() {
        Assert.assertTrue(page.titleIsDisplayedBringItOn());
    }

    @Test
    public void syntaxIsTrueTest() {
        Assert.assertTrue(page.syntaxIsDisplayedBringItOn());
    }

    @Test
    public void codeIsTrueTest() {
        String expectResult = "git config --global user.name  \"New Sheriff in Town\""
                + "\n" + "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")"
                + "\n" + "git push origin master --force";
        String realResult = driver.findElement(By.xpath(".//textarea[@id='paste_code']")).getText();
        Assert.assertEquals(expectResult, realResult);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
