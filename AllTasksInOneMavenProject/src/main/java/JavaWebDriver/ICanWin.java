package JavaWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICanWin {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:/studyautomate/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Page page = new Page(driver);
        page.iCanWin("Hello from WebDriver", "helloweb");
        driver.quit();
    }

}
