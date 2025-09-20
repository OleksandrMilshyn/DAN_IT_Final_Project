import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void openSite(){
        Selenide.open("https://www.bazar-ua.shop/");
    }
}
