import googlePages.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchDomain extends BaseTest{

    @Test
    public void findOnSearchList () {
        String searchRequest = "automation";
        String searchDomain = "testautomationday.com";
        int quantityOfPages = 5;
        GoogleSearchPage searchPage = new GoogleSearchPage();
        Assert.assertTrue(searchPage.searchDomainOnPages(searchRequest, quantityOfPages, searchDomain));
    }

}
