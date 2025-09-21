package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogoMainButtonTest extends BaseTest {

    @Test
    public void verifyLogoMainButton(){
        testCaseId = 4;

        HomePage homePage = new HomePage();
        homePage.accountButton();
        homePage.enterButton();

        LoginPage loginPage = new LoginPage();
        loginPage.logoTitle();

        Assert.assertTrue(homePage.verifyHomePage());
    }
}
