package finalProject.tests;

import finalProject.HomePage;
import finalProject.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySearchButtonTest extends BaseTest{

    @Test
    public void verifySearchButton(){
        testCaseId = 7;

        String wordToFind = "Samsung";

        HomePage homePage = new HomePage();
        homePage.searchField(wordToFind);
        homePage.clickSearchButton();

        SearchResultsPage searchResultPage = new SearchResultsPage();

        Assert.assertTrue(searchResultPage.getTitle().toUpperCase().contains(wordToFind.toUpperCase()));
    }
}
