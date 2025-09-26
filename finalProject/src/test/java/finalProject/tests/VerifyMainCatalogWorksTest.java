package finalProject.tests;

import finalProject.CategoryPage;
import finalProject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMainCatalogWorksTest extends BaseTest{

    @Test
    public void verifyMainCatalogWorks(){
        testCaseId = 8;

        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();

        Assert.assertTrue(homePage.verifyAllMainItemsWorks(categoryPage.mainLogo()));

    }
}
