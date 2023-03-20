package tests.web.loginTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.loginPage.LoginMethods;
import supplementary.Base;
import supplementary.TestData;
@Listeners
public class LoginTest extends Base {
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter(pathLogin);
    ExtentTest test = extent.createTest("LOGINTEST");
    LoginMethods loginMethods;
    @BeforeTest(alwaysRun = true)
    public void first(){ loginMethods = new LoginMethods(driver); extent.attachReporter(spark); }

    @Test()
    public void LoginMethods(){
        try {
            loginMethods.clickLoginBtn();
            test.log(Status.PASS, "Login button clicked");
            extent.flush();
        }catch (Exception e){
            test.fail(" Login Button could not be clicked");
            extent.flush();
        }try {
            loginMethods.sendEmail(email);
            test.log(Status.PASS, "Email key sent");
            extent.flush();
        }catch (Exception e){
            test.fail(" Email key could not be sent");
            extent.flush();
        }try {
            loginMethods.sendPass(password);
            test.log(Status.PASS, "Password key sent");
            extent.flush();
        }catch (Exception e){
            test.fail("Password key could not be sent");
            extent.flush();
        }
    }
    final static String email = TestData.dataLogin.userName;
    final static String password = TestData.dataLogin.userPassword;
}
