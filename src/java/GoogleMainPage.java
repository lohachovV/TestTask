import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage {

    public SelenideElement setText (String searchRequest){
        return $(By.className("gLFyf")).setValue(searchRequest);
    }

}
