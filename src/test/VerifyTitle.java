import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;


public class VerifyTitle extends BaseTest{

    private GoogleMainPage mainPageGoogle = new GoogleMainPage();
    private GoogleSearchPage searchPage = new GoogleSearchPage();
    private FirstSiteOfSerchResult firstSite = new FirstSiteOfSerchResult();

    @BeforeTest
    public void pageOpen(){
        open(url);
    }

    @Test
    public void checkTitleOfFirstResult() {
        String searchRequest = "automation";
        mainPageGoogle.setText(searchRequest).pressEnter();
        searchPage.getResultList().get(0).shouldBe(visible).$(By.tagName("h3")).click();
        Assert.assertTrue(firstSite.getTitleElement().innerText().toLowerCase().contains(searchRequest));

    }

}
