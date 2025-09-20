import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void accountButton(){$("div.button-account").click();}

    public void enterButton(){$("ul.list-unstyled a[href*='account/login']");}

    public boolean verifyHomePage(){return $("div.advantages-block").isDisplayed();}


}
