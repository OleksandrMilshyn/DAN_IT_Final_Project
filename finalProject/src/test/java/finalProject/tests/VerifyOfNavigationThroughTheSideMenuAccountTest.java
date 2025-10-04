package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOfNavigationThroughTheSideMenuAccountTest extends BaseTest{

    @Test
    public void verifyOfNavigationThroughTheSideMenuAccount(){
        testCaseId = 18;

        String expectedUrl = "https://www.bazar-ua.shop/index.php?route=account/login";

        HomePage homePage = new HomePage();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.clickAccountOnTheSideMenu();

        Assert.assertTrue(loginPage.getUrlPage().contains(expectedUrl));
    }
}
