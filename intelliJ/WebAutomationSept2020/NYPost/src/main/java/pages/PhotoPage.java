package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PhotoPage extends News{

    private final WebDriver driver;
    public PhotoPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    @FindBy(how = How.CSS, using = "div.headline-container a:nth-child(2) h3")
    public static WebElement headLineNewsWebElement;

    public WebElement getHeadLineNewsWebElement() {
        return headLineNewsWebElement;
    }
}
