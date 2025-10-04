package finalProject.tests;

import finalProject.HomePage;
import finalProject.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductComparisonVerificationTest extends BaseTest{

    @Test
    public void productComparisonVerification(){
        testCaseId = 13;

        String expectedSuccessMessage = "Ви успішно додали";

        HomePage homePage = new HomePage();
        homePage.toProductPage();

        ProductPage productPage = new ProductPage();
        productPage.clickProductComparison();

        Assert.assertTrue(productPage.getTextAlertMassage().contains(expectedSuccessMessage));
    }
}
