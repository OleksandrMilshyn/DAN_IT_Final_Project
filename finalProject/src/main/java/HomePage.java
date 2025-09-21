import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class HomePage {

    public void accountButton(){$("div.button-account").click();}

    public void enterButton(){$("ul.list-unstyled a[href*='account/login']");}

    public boolean verifyHomePage(){return $("div.advantages-block").isDisplayed();}

    public void facebookButton(){
        $("a[href*='facebook.com']").click();
        switchTo().window(1);}

    public String getCurrentURL(){return WebDriverRunner.url();}


}
