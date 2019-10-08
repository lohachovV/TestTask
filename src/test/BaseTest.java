import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public String url = "http://google.com";

    @BeforeTest
    public void pageOpen(){
        open(url);
    }
}
