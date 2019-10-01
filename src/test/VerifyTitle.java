import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
    private GoogleMainPage page = new GoogleMainPage();
    private String url = "http://google.com";
    private String searchRequest = "testautomationday.com";

    @BeforeTest
    public void pageOpen(){
        page.openPage(url);
    }

    @Test
    public void checkTitle(){
        page.setText(searchRequest);
        page.searchButton();

    }
}
