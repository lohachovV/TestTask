import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FirstSiteOfSerchResult {

    public SelenideElement getTitle (){
        return $(By.tagName("title"));
    }
}
