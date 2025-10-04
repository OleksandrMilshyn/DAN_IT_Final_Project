package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOfNavigationToThePasswordRecoveryTest extends BaseTest{

    @Test
    public void verifyOfNavigationToThePasswordRecovery(){
        testCaseId = 15;

        String expectedTitle = "забули";

        HomePage homePage = new HomePage();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonOfForgotPassword();
        String a = loginPage.getTitle();

        Assert.assertTrue(loginPage.getTitle().toLowerCase().contains(expectedTitle));
    }
}
