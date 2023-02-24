package tests.web.loginTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.loginPage.LoginMethods;
import supplementary.Base;
import supplementary.TestData;
@Listeners
public class LoginTest extends Base {

    LoginMethods loginMethods;
    @BeforeTest(alwaysRun = true)
    public void first(){ loginMethods = new LoginMethods(driver); }

    @Test()
    public void LoginMethods() throws InterruptedException {
        loginMethods.clickLoginBtn();
        loginMethods.sendEmail(email);
        loginMethods.sendPass(password);
    }

    final static String email = TestData.dataLogin.userName;
    final static String password = TestData.dataLogin.userPassword;
}
