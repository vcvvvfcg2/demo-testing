package supplementary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class SimpleMethods {
    DatesData datesData;
    public boolean click(WebDriver driver, WebElement element, WebDriverWait wait){
        element.click();
        return true;
    }

    public Boolean sendKeys(WebElement element, String text, WebDriver driver, WebDriverWait wait) throws InterruptedException {
        waitElement(driver);
        element.click();
        element.sendKeys(text);
        return null;
    }

    public void dropdown(String dates, String drpName, WebDriver driver, WebDriverWait wait) throws InterruptedException {
        waitElement(driver);
        Select drpCert = new Select(driver.findElement(By.name(drpName)));
        drpCert.selectByVisibleText(dates);
    }

    public boolean titleCorrect(WebDriver driver, WebElement element , WebDriverWait wait, int option) {

        String title = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/h1[1]")).getText();

        datesData = new DatesData();
        datesData.datesNumber(option);
        String as = DatesData.dateOffers;

        if (title.contains(as)) {
            Assert.assertTrue(true, "true");
            return true;
        } else {
            Assert.fail("Fecha incorrecta");
            return false;
        }
    }

    public void loadWebsite(String url, WebDriver driver) throws InterruptedException {
        driver.get(url);
    }

    public void quit(WebDriver driver){
        driver.quit();
    }

    public void waitElement(WebDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public class DatesData{
        public void datesNumber(int option) {

            switch (option) {
                case 1:
                    number = option;
                    dateOffers = "Enero";
                    break;
                case 2:
                    number = option;
                    dateOffers = "Febrero";
                    break;
                case 3:
                    number = option;
                    dateOffers = "Marzo";
                    break;
                case 4:
                    number = option;
                    dateOffers = "Abril";
                    break;
                case 5:
                    number = option;
                    dateOffers = "Mayo";
                    break;
                case 6:
                    number = option;
                    dateOffers = "Junio";
                    break;
                case 7:
                    number = option;
                    dateOffers = "Julio";
                    break;
                case 8:
                    number = option;
                    dateOffers = "Agosto";
                    break;
                case 9:
                    number = option;
                    dateOffers = "Septiembre";
                    break;
                case 10:
                    number = option;
                    dateOffers = "Octubre";
                    break;
                case 11:
                    number = option;
                    dateOffers = "Noviembre";
                    break;
                case 12:
                    number = option;
                    dateOffers = "Diciembre";
                    break;
            }
        }
        public static int number;
        public static String dateOffers;
    }
}
