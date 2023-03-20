package pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import supplementary.SimpleMethods;

import java.time.Duration;

public class LoginMethods extends SimpleMethods {
    WebDriver driver;
    WebDriverWait wait;
    AjaxElementLocatorFactory ajax;

    @FindBy(xpath="//a[contains(text(),'Log In')]")
    WebElement logInBtn;
    @FindBy(id= "member_email")
    WebElement logInEmail;
    @FindBy(id= "member_password")
    WebElement logInPassword;
    @FindBy(id= "form-button")
    WebElement logInBtnSubmit;
    @FindBy(xpath = "//a[contains(text(),'View Product')]")
    WebElement ViewProductBtn;

    public LoginMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        ajax = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajax,this);
    }


    public Boolean clickLoginBtn() {return click(driver, logInBtn, wait);}
    public Boolean sendEmail(String email) { return sendKeys(logInEmail, email, driver, wait);}
    public Boolean sendPass(String pass) { return sendKeys(logInPassword, pass, driver, wait);}
    public Boolean clickSubmitBtn() { return click(driver, logInBtnSubmit, wait);}
    public Boolean clickViewPrdt() { return click(driver, ViewProductBtn, wait);}

}
