import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class FirstSiteOfSerchResult {

    public SelenideElement getTitleElement (){
        return $(By.tagName("title"));
    }
}
