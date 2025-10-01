package finalProject.tests;

import finalProject.HomePage;
import finalProject.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFromCartTest extends BaseTest{

    @Test
    public void deleteFromCart(){
        testCaseId = 10;
        String expectedCartItemCount = "0";

        HomePage homePage = new HomePage();
        homePage.toProductPage();

        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        productPage.clickCartButton();
        productPage.deleteFromCart();

        Assert.assertTrue(productPage.getCartQuantityAfterDelete().contains(expectedCartItemCount));
    }
}
