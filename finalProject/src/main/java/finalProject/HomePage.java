package finalProject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void clickAccountButton(){
        $("div.button-account").click();
        $("ul.list-unstyled a[href*='account/login']").click();
    }

    public boolean verifyHomePage(){return $("div.advantages-block").isDisplayed();}

    public void clickFacebookButton(){
        $("a[href*='facebook.com']").click();
        switchTo().window(1);}

    public String getCurrentURL(){return WebDriverRunner.url();}

    public void clickSettingsButton(){
        $("div.button-setting").click();
        $("span.dropdown-toggle").click();
    }

    public void clickEnglishLanguage(){$("[href='en']").click();}

    public String getLatestTitle(){return $("div.box-heading").getText();}

    public void searchField(String searchWord){$("[name='search']").sendKeys(searchWord);}

    public void clickSearchButton(){$("button.button-search").click();}

    public boolean verifyAllMainItemsWorks(SelenideElement returnToTheHomePage){
        for (int i = 0; i < 7; i++) {
            SelenideElement itemSelector = $$("ul.menu.sf-js-enabled.sf-arrows>li").get(i);
            String expectedTitle = itemSelector.getText();
            itemSelector.click();

            String actualTitle = $("#content").shouldBe(visible).getText();

            if (!actualTitle.contains(expectedTitle)){
                return false;
            }

            returnToTheHomePage.click();
        }
        return true;
    }

    public void toProductPage(){$("a.lazy").click();}

    public String getPriceTheFirstLatestProduct(){return $("div.caption [class*=price]").getText();}
}
