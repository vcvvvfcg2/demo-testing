package supplementary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.net.MalformedURLException;

public class Base extends SimpleMethods{
    protected WebDriver driver;
    @Parameters({"browser", "Headless"})
    @BeforeTest
    public void browserName(String browser, String Headless) throws MalformedURLException, InterruptedException {

        if (Headless.equals("True")) {
            if (browser.equals("Chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(true);
                driver = new ChromeDriver(options);

            } else if (browser.equals("Firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);
                driver = new FirefoxDriver(options);

            } else if (browser.equals("Edge")) {
                EdgeOptions options = new EdgeOptions();
                options.setHeadless(true);
                driver = new EdgeDriver(options);

            } else {
                SafariOptions options = new SafariOptions();
                driver = new SafariDriver(options);
                driver.manage().window().maximize();
            }
        }else if (Headless.equals("False")) {

            if (browser.equals("Chrome")) {
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();

            } else if (browser.equals("Firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);
                driver.manage().window().maximize();

            } else if (browser.equals("Edge")) {
                EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver(options);
                driver.manage().window().maximize();

            } else {
                SafariOptions options = new SafariOptions();
                driver = new SafariDriver(options);
                driver.manage().window().maximize();

            }
        }
    }
    @Parameters("URL")
    @BeforeTest
    public void loadWeb(String url){
       loadWebsite(url, driver);
    }

    @AfterTest
    public void exit(){
        quit(driver);}
}
