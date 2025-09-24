package finalProject;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    public String getTitle(){return $("h1").getText();}
}
