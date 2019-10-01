import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Data
public class GoogleMainPage {

    private WebDriver driver = Constants.CHROME_DRIVER;
    private WebElement searchField;


    public void openPage (String url) {
        driver.get(url);
    }

    public void setText (String searchRequest){
        searchField = driver.findElement(By.className("gLFyf"));
        searchField.click();
        searchField.sendKeys(searchRequest);
    }

    public void searchButton (){
        driver.findElement(By.cssSelector(".gNO89b")).click();
    }



}
