import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;


public class GoogleSearchPage {

    @FindBy (id = "pnprev")
    SelenideElement buttonPrev;

    @FindBy (id = "pnnext")
    SelenideElement buttonNext;

    public List<SelenideElement> getResultList (){
        return $$(By.className("g"));

    }

    public List <SelenideElement> getPagination(){
        return $$(By.cssSelector("a[aria-label*=Page]"));
    }

//    public SelenideElement buttonNext (){
//        return $(By.id("pnnext"));
//    }
//
//    public SelenideElement buttonPrev(){
//        return $(By.id("pnprev"));
//    }


}
