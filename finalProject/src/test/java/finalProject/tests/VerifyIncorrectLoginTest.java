package finalProject.tests;

import finalProject.HomePage;
import finalProject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyIncorrectLoginTest extends BaseTest{

    @Test
    public void verifyIncorrectLogin(){
        testCaseId = 16;

        String notification = "E-Mail і/чи пароль не співпадають.";
        String emailAndPasswordExample = "test";

        HomePage homePage = new HomePage();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.enterTheLogin(emailAndPasswordExample);
        loginPage.enterThePassword(emailAndPasswordExample);
        loginPage.clickEnterButton();

        Assert.assertTrue(loginPage.getTextAlertMassage().contains(notification));

    }
}
