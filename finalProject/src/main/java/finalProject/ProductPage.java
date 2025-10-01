package finalProject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    public void addToCart(){$("#button-cart").click();}

    public String getCartQuantity(){return $("#cart-total2").shouldHave(Condition.text("1")).getText();}

}
