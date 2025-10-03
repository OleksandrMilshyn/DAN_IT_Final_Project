package finalProject.tests;

import finalProject.HomePage;
import finalProject.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPriceProductTest extends BaseTest{

    @Test
    public void verifyPriceProduct(){
        testCaseId = 11;

        HomePage homePage = new HomePage();
        String expectedPriceProduct = homePage.getPriceTheFirstLatestProduct();
        homePage.toProductPage();
        ProductPage productPage = new ProductPage();

        Assert.assertTrue(productPage.actualPriceProduct().equalsIgnoreCase(expectedPriceProduct));

    }
}
