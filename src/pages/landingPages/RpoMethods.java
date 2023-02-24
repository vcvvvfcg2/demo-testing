package pages.landingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import supplementary.SimpleMethods;
import supplementary.TestData;
import java.time.Duration;

public class RpoMethods extends SimpleMethods {

    WebDriver driver;
    WebDriverWait wait;
    AjaxElementLocatorFactory ajax;

    @FindBy(className = "dropdown__trigger")
    WebElement certDrpDwn;
    @FindBy(xpath = "//*[@id=\"block-1674846921336\"]/div/div/span[4]/a\n")
    WebElement poDirect;
    @FindBy(id= "owner")
    WebElement dateDrpDwn;
    @FindBy(css = "#owner > option:nth-child(2)")
    WebElement optionDate;
    @FindBy(xpath = "//*[@id=\"block-1675798072929\"]/div/center/center/button")
    WebElement btnOffer;
    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/h1[1]")
    WebElement titleText;
    public RpoMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        ajax = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajax,this);

    }
    public Boolean clickCertDrpDwn() {return click(driver, certDrpDwn, wait);}
    public Boolean clickPoDirect() {return click(driver, poDirect, wait);}
    public Boolean clickDateDrpDwn() {return click(driver, dateDrpDwn, wait);}
    public Boolean clickDateOffer() {return click(driver, optionDate, wait);}
    public Boolean clickOffer() {return click(driver, btnOffer, wait);}
    public Boolean correctTitle() {return titleCorrect(driver, titleText, wait, datata); }

    final static int datata = TestData.month.date;
}
