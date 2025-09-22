package finalProject.tests;

import finalProject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLanguageButtonTest extends BaseTest{

    @Test
    public void verifyLanguageButton(){
        testCaseId = 6;

        String expectedTitle = "Latest";

        HomePage homePage = new HomePage();
        homePage.clickSettingsButton();
        homePage.clickEnglishLanguage();

        Assert.assertEquals(homePage.getLatestTitle().toLowerCase(), expectedTitle.toLowerCase());
    }
}
