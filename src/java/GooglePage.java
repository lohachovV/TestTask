import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

    private Constants constants = new Constants();

    @FindBy (className = "gLFyf.gsfi")
    WebElement searchField;

    WebDriver driver = constants.getDriver();


    public void openPage (String url) {
        driver.get(url);
    }

    public void setText (String searchRequest){
        driver.findElement(By.className("gsfi")).sendKeys(searchRequest);


    }

}
