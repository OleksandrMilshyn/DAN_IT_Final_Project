package finalProject.tests;

import com.codeborne.selenide.Selenide;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static finalProject.TestRailController.publishResults;

public class BaseTest {

    protected int testCaseId;

    @BeforeMethod
    public void openSite(){
        Selenide.open("https://www.bazar-ua.shop/");
    }

    @AfterMethod
    public void publishTestResultsToTestRail(ITestResult testResult){
        if(testResult.getStatus() == ITestResult.SUCCESS){
            publishResults(1, testCaseId);
        } else {
            publishResults(5, testCaseId);
        }
    }
}
