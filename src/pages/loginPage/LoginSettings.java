package pages.loginPage;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import supplementary.SimpleMethods;

    import java.time.Duration;

public class LoginSettings extends SimpleMethods {
    WebDriver driver;
    WebDriverWait wait;
    AjaxElementLocatorFactory ajax;

    @FindBy(xpath=" //a[contains(text(),'Log In')]")
    WebElement logInBtn;
    public LoginSettings(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        ajax = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajax,this);
    }

    public boolean clickLogin(){return click(driver, logInBtn, wait);}

}
