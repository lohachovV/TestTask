import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;


public class GoogleSearchPage {

    public List<SelenideElement> getResultList (){
        return $$(("div[class=g]"));
    }
    public List <SelenideElement> getPagination(){
        return $$(By.cssSelector("a[aria-label*=Page]"));
    }

    public SelenideElement buttonNext (){
        return $(By.id("pnnext"));
    }

    public SelenideElement buttonPrev(){
        return $(By.id("pnprev"));
    }

    public SelenideElement findLink (SelenideElement searchResult){
        return searchResult.$(By.tagName("cite"));
    }

    public boolean findDomain (String domainLink){
        boolean resultOfFound= false;
        for(SelenideElement element : getResultList()){
            if(findLink(element).text().contains(domainLink) ){
                resultOfFound = true;
                break;
            }
        }
        return resultOfFound;
    }


}
