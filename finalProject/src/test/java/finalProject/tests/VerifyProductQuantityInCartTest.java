package finalProject.tests;

import finalProject.CartPage;
import finalProject.HomePage;
import finalProject.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCartTest extends BaseTest{

    @Test
    public void productQuantityInCartTest(){
        testCaseId = 12;

        String expectedQuantityOfProduct = "3";

        HomePage homePage = new HomePage();
        homePage.toProductPage();

        ProductPage productPage = new ProductPage();
        productPage.addQuantityOfProduct(expectedQuantityOfProduct);
        productPage.addToCart();
        productPage.toCart();

        CartPage cartPage = new CartPage();

        Assert.assertTrue(cartPage.getQuantityOfProduct().contains(expectedQuantityOfProduct));
    }
}
