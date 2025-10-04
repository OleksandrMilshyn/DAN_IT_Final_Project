package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnterWithoutLoginAndPasswordTest extends BaseTest{

    @Test
    public void enterWithoutLoginAndPassword(){
        testCaseId = 17;

        String notification = "E-Mail і/чи пароль не співпадають.";

        HomePage homePage = new HomePage();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.clickEnterButton();

        Assert.assertTrue(loginPage.getTextAlertMassage().contains(notification));
    }
}
