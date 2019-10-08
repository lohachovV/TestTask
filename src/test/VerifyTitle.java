import googlePages.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sites.FirstSiteOfSerchResult;

import static com.codeborne.selenide.Selenide.open;


public class VerifyTitle extends BaseTest{

    @Test
    public void checkTitleOfFirstResult() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        FirstSiteOfSerchResult firstSite = new FirstSiteOfSerchResult();
        String searchRequest = "automation";
        searchPage.clickOnFirstLink(searchRequest);
        Assert.assertTrue(firstSite.getTitleElement().innerText().toLowerCase().contains(searchRequest));
    }

}
