package googlePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.logging.Logger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class GoogleSearchPage {
    private static Logger log = Logger.getLogger(GoogleSearchPage.class.getName());

    private GoogleMainPage mainPageGoogle = new GoogleMainPage();

    private List<SelenideElement> getResultList (){
        return $$(("div[class=g]"));
    }
    private SelenideElement buttonNext (){
        return $(By.id("pnnext"));
    }
    private SelenideElement findLink (SelenideElement searchResult){
        return searchResult.$(By.tagName("cite"));
    }

    private boolean findDomain (String domainLink){
        boolean resultOfFound= false;
        for(SelenideElement element : getResultList()){
            if(findLink(element).text().contains(domainLink) ){
                resultOfFound = true;
                break;
            }
        }
        return resultOfFound;
    }

    public boolean searchDomainOnPages(String searchRequest, int quantityOfPages, String searchDomain){
        mainPageGoogle.setText(searchRequest).pressEnter();
        boolean result = false;
        for (int i = 1; i<=quantityOfPages; i++){
            if(!findDomain(searchDomain)){
                buttonNext().click();
            } else{
                result = true;
                log.info("address that you're looking for is on page: " + i);
                break;
            }
            log.info("this pages hasn't address that you're looking for");
        }
        return result;
    }

    public void clickOnFirstLink(String searchRequest){
        mainPageGoogle.setText(searchRequest);
        getResultList().get(0).shouldBe(visible).$(By.tagName("h3")).click();
    }


}
