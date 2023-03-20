package tests.web.landingTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.landingPages.RpoMethods;
import supplementary.Base;


@Listeners
public class RpoTest extends Base {

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter sparkpo = new ExtentSparkReporter(pathPo);
    ExtentTest test = extent.createTest("RPOTEST");
     RpoMethods rpoMethods;
    @BeforeTest(alwaysRun = true)
    public void first(){ rpoMethods = new RpoMethods(driver); extent.attachReporter(sparkpo);}
    @Test
    public void RpoTest() {
        try {
            rpoMethods.clickCertDrpDwn();
            test.log(Status.PASS, "dropdown clicked");
            extent.flush();
        }catch (Exception e){
            test.fail(" dropdown could not be clicked");
            extent.flush();
        }try {
            rpoMethods.clickPoDirect();
            test.log(Status.PASS, "dbutton clicked");
            extent.flush();
        }catch (Exception e){
            test.fail(" button could not be clicked");
            extent.flush();
        } try {
            rpoMethods.clickDateDrpDwn();
            test.log(Status.PASS, "dropdown date clicked");
            extent.flush();
        }catch (Exception e){
            test.fail(" dropdown date could not be clicked");
            extent.flush();
        } try {
            rpoMethods.clickDateOffer();
            test.log(Status.PASS, "date offer clicked");
            extent.flush();
        }catch (Exception e){
            test.fail("date offer could not be clicked");
            extent.flush();
        } try {
            rpoMethods.clickOffer();
            test.log(Status.PASS, "offer clicked");
            extent.flush();
        }catch (Exception e){
            test.fail(" offer could not be clicked");
            extent.flush();
        } try {
            rpoMethods.correctTitle();
            test.log(Status.PASS, "correct title especified");
            extent.flush();
        }catch (Exception e){
            test.fail("title is not correct");
            extent.flush();
        }
    }
}
