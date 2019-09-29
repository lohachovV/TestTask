import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Constants {
    private final WebDriver CHROME_DRIVER = new ChromeDriver();

    public WebDriver getDriver() {
        return CHROME_DRIVER;
    }
}
