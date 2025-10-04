package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOfNavigationToTheNewUserRegistrationTest extends BaseTest{

    @Test
    public void verifyOfNavigationToTheNewUserRegistration(){
        testCaseId = 14;

        String expectedTitle = "Зареєструватися";

        HomePage homePage = new HomePage();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonOfNewUserRegistration();

        Assert.assertTrue(loginPage.getTitle().equalsIgnoreCase(expectedTitle));

    }
}
