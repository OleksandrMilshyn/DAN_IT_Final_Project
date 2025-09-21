package finalProject.tests;

import finalProject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyFacebookButtonTest extends BaseTest{

    @Test
    public void verifyFacebookButton(){
        testCaseId = 5;

        String expectedResultURL = "https://www.facebook.com/";

        HomePage homePage = new HomePage();
        homePage.facebookButton();

        Assert.assertTrue(homePage.getCurrentURL().contains(expectedResultURL));
    }
}
