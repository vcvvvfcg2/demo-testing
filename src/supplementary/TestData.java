package supplementary;


import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"First-Value"},};
    }
    public static class browser {
        public final static String browser = "Chrome";
        public final static Boolean headless = true;
    }

    public static class dataLogin {
        public final static String userName = "vcvvvfcg@gmail.com";
        public final static String userPassword = "123";
    }

    public static class month {
        public final static int date = 4;
    }

    public static class reportPath  {
        public final static String pathPO = "/Users/m1vf/IdeaProjects/demo-testing/output-tests/RpoTest.html";
        public final static String pathLogin = "/Users/m1vf/IdeaProjects/demo-testing/output-tests/LoginTestReport.html";
    }
}
