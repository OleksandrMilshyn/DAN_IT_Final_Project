package finalProject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    public void addToCart(){$("#button-cart").click();}

    public String getCartQuantity(){return $("#cart-total2").shouldHave(Condition.text("1")).getText();}

    public String getCartQuantityAfterDelete(){return $("#cart-total2").shouldHave(Condition.text("0")).getText();}

    public void clickCartButton(){$("div.box-cart").click();}

    public void deleteFromCart(){$("[class='fa fa-times']").click();}

    public String actualPriceProduct() {return $("span.price-new:nth-of-type(2)").getText();}

    public void addQuantityOfProduct(String number){$("[name*='quantity']").setValue(number);}

    public void toCart(){
        $("div.box-cart").click();
        $("[class='btn btn-default']").click();
    }

    public void clickProductComparison(){$("button.btn.product-btn[onclick*=compare]").click();}

    public String getTextAlertMassage(){return $("div.alert.alert-success").shouldBe(visible).getText();}

}
