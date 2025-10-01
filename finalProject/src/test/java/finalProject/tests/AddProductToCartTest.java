package finalProject.tests;

import finalProject.HomePage;
import finalProject.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        testCaseId = 9;

        String expectedCartItemCount = "1";

        HomePage homePage = new HomePage();
        homePage.toProductPage();

        ProductPage productPage = new ProductPage();
        productPage.addToCart();

        Assert.assertTrue(productPage.getCartQuantity().contains(expectedCartItemCount));

    }
}
