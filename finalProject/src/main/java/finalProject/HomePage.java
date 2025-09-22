package finalProject;

import com.codeborne.selenide.WebDriverRunner;
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
}
