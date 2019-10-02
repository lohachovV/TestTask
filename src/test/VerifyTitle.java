import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;


public class VerifyTitle {
    private GoogleMainPage page = new GoogleMainPage();
    private GoogleSearchPage searchPage = new GoogleSearchPage();
    private FirstSiteOfSerchResult firstSite = new FirstSiteOfSerchResult();

    private String url = "http://google.com";
    private String searchRequest = "automation";

    @BeforeTest
    public void pageOpen(){
        open(url);
    }

    @Test
    public void checkTitleOfFirstResult() throws InterruptedException {
        page.setText(searchRequest).pressEnter();
        searchPage.getResultList().get(0).shouldBe(visible).$(By.tagName("h3")).click();
        firstSite.getTitle().has(text(searchRequest));

    }

}
