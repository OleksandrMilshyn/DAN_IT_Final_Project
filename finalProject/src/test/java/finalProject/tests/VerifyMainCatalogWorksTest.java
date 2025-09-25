package finalProject.tests;

import finalProject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMainCatalogWorksTest extends BaseTest{

    @Test
    public void verifyMainCatalogWorks(){

        HomePage homePage = new HomePage();

        Assert.assertTrue(homePage.verifyAllMainItemsWorks());

    }
}
