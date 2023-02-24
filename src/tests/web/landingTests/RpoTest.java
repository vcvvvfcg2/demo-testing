package tests.web.landingTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.landingPages.RpoMethods;
import supplementary.Base;
import supplementary.ReportsListener;

@Listeners
public class RpoTest extends Base {
     RpoMethods rpoMethods;
    @BeforeTest(alwaysRun = true)
    public void first(){ rpoMethods = new RpoMethods(driver); }
    @Test()
    public void RpoTest() {
        rpoMethods.clickCertDrpDwn();
        rpoMethods.clickPoDirect();
        rpoMethods.clickDateDrpDwn();
        rpoMethods.clickDateOffer();
        rpoMethods.clickOffer();
        rpoMethods.correctTitle();
    }
}
