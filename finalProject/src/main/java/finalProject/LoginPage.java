package finalProject;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void logoTitle(){$("#logo").click();}

    public void clickButtonOfNewUserRegistration(){$("[class='btn btn-primary']").click();}

    public String getTitle() {return $("h1").getText();}

    public void clickButtonOfForgotPassword(){$("div.form-group a[href*='forgotten']").click();}

}
