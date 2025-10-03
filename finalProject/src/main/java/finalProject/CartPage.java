package finalProject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public String getQuantityOfProduct(){return $("#cart-total2").shouldHave(Condition.text("3")).getText();}
}
