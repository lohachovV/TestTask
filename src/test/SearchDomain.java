import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.open;

public class SearchDomain {
    private static Logger log = Logger.getLogger(SearchDomain.class.getName());

    private String url = "http://google.com";
    private String searchRequest = "automation";
    private String searchDomain = "testautomationday.com";
    private int quantityOfPages = 5;

    private GoogleSearchPage searchPage = new GoogleSearchPage();
    private GoogleMainPage mainPageGoogle = new GoogleMainPage();

    @BeforeTest
    public void pageOpen(){
        open(url);
    }

    @Test
    public void searchDomainOnPages(){
        mainPageGoogle.setText(searchRequest).pressEnter();
        for (int i = 1; i<=quantityOfPages; i++){
            if(!searchPage.findDomain(searchDomain)){
                searchPage.buttonNext().click();
            }
            else{
                log.info("address that you're looking for is on page: " + i);
                break;
            }
            log.info("this pages hasn't address that you're looking for");
        }
    }
}
