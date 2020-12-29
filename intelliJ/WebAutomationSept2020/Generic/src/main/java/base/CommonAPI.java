package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {

        // using firefox driver
        //System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/SeleniumProject1/driver/geckodriver");

        // using chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/chromedriver");

        driver = new ChromeDriver();  //chrome
        //driver = new FirefoxDriver(); // firefox

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //  driver.get("http://amazon.com");
        //  driver.get("https://nypost.com/");


        // driver.get(url);  // website address (one way to get url)
        driver.navigate().to(url);

        driver.manage().window().maximize();  // commands to window
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();  // closing the opened window after operation

        //  driver.quit();   // way to quit the window
    }


    public void clickOnWebElement(String locator){   // implementing all possible locator types by try catch block
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.className(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }

    }

    public void typeOnWebElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
                driver.findElement(By.className(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                }
            }
        }
    }

    public void typeOnWebElementNHitEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void clearInputField(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.className(locator)).clear();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).clear();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).clear();
                }
            }
        }

    }

    public List<WebElement> getListOfWebElements(String locator) {
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));
        return elementList;
    }
    public List<String> getListOfText(List<WebElement> elements) {
        List<String> listOfText = new ArrayList<String>();
        for(WebElement element: elements){
            listOfText.add(element.getText());
        }
        return listOfText;
    }

    public List<String> getListOfText(String locator) {
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));
        List<String> listOfText = new ArrayList<String>();
        for(WebElement element: elementList){
            listOfText.add(element.getText());
        }
        return listOfText;
    }

    public void printText(List<String> list){
        for (String st: list) {
            System.out.println(st);
        }

    }

}
