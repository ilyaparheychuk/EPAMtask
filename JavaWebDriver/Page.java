import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    @FindBy(xpath = ".//textarea[@name='paste_code']")
    private WebElement codeField;

    @FindBy(xpath = ".//span[text()='None']")
    private WebElement syntax;

    @FindBy(xpath = ".//li[text()='Bash']")
    private WebElement syntaxBash;

    @FindBy(xpath = ".//span[text()='Never']")
    private WebElement expiration;

    @FindBy(xpath = ".//li[text()='10 Minutes']")
    private WebElement expirationTenMinutes;

    @FindBy(xpath = ".//input[@name='paste_name']")
    private WebElement pasteName;

    @FindBy(id = "submit")
    private WebElement createPost;

    @FindBy(id = "main_frame")
    private WebElement empty;

    @FindBy(xpath = ".//div[@title='how to gain dominance among developers']")
    private WebElement titleBringItOn;

    @FindBy(xpath = ".//a[text()='Bash']")
    private WebElement syntaxBashIs;

    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iCanWin(String code, String paste){
        driver.get("https://pastebin.com");
        driver.manage().window().maximize();
        codeField.sendKeys(code);
        expiration.click();
        expirationTenMinutes.click();
        pasteName.sendKeys(paste);
        createPost.click();

    }

    public void bringItOn(String code, String paste){
        driver.get("https://pastebin.com");
        driver.manage().window().maximize();
        codeField.sendKeys(code);
        syntax.click();
        syntaxBash.click();
        expiration.click();
        expirationTenMinutes.click();
        pasteName.sendKeys(paste);
        createPost.click();
    }

    public boolean titleBringItOn(){
        return (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.visibilityOf(titleBringItOn)).isDisplayed();
    }

    public boolean syntaxBringItOn(){
        return (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.visibilityOf(syntaxBashIs)).isDisplayed();
    }
}
