package finalProject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void logoTitle(){$("#logo").click();}

    public void clickButtonOfNewUserRegistration(){$("[class='btn btn-primary']").click();}

    public String getTitle() {return $("h1").getText();}

    public void clickButtonOfForgotPassword(){$("div.form-group a[href*='forgotten']").click();}

    public void enterTheLogin(String someEmail){$("div.form-group [type='text']").setValue(someEmail);}

    public void enterThePassword(String somePassword){$("[type='password']").setValue(somePassword);}

    public void clickEnterButton(){$("[type='submit']").click();}

    public String getTextAlertMassage(){return $("div.alert.alert-danger").shouldBe(visible).getText();}
}
