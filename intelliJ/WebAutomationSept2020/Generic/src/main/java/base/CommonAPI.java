package base;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {


//    //Extent Report
//    public static ExtentReports extent;
//    @BeforeSuite
//    public void extentSetup(ITestContext context) {
//        ExtentManager.setOutputDirectory(context);
//        extent = ExtentManager.getInstance();
//    }
//    @BeforeMethod
//    public void startExtent(Method method) {
//        String className = method.getDeclaringClass().getSimpleName();
//        String methodName = method.getName().toLowerCase();
//        ExtentTestManager.startTest(method.getName());
//        ExtentTestManager.getTest().assignCategory(className);
//    }
//    protected String getStackTrace(Throwable t) {
//        StringWriter sw = new StringWriter();
//        PrintWriter pw = new PrintWriter(sw);
//        t.printStackTrace(pw);
//        return sw.toString();
//    }
//    @AfterMethod
//    public void afterEachTestMethod(ITestResult result) {
//        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
//        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
//
//        for (String group : result.getMethod().getGroups()) {
//            ExtentTestManager.getTest().assignCategory(group);
//        }
//
//        if (result.getStatus() == 1) {
//            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
//        } else if (result.getStatus() == 2) {
//            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
//        } else if (result.getStatus() == 3) {
//            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
//        }
//        ExtentTestManager.endTest();
//        extent.flush();
//        if (result.getStatus() == ITestResult.FAILURE) {
//            captureScreenshot(driver, result.getName());
//        }
//        driver.quit();
//    }
//    @AfterSuite
//    public void generateReport() {
//        extent.close();
//    }
//    private Date getTime(long millis) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(millis);
//        return calendar.getTime();
//    }

    //WebDriver

    public String browserStackUserName = null;    //"your_user_name";
    public String browserStackAccessKey = null;      //"Your_Access_Key";
    public String sauceLabsUserName = null;               //"";
    public String sauceLabsAccessKey = null;      //"";

    public static WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {


//    @Parameters({ "useCloudEnv", "envName",  "os",  "os_version",
//                 "browserName",  "browserVersion","url"})
//    @BeforeMethod
//    public void setUp(String useCloudEnv, String envName, String os, String os_version,
//                      String browserName, String browserVersion, String url) throws MalformedURLException {
//
//        if(useCloudEnv.equalsIgnoreCase("true")) {
//            getCloudDriver( envName,  os,  os_version,
//                     browserName,  browserVersion );
//        }
//        else if (useCloudEnv.equalsIgnoreCase("false")) {
//            getLocalDriver(os, browserName);
//        }

        // using firefox driver
        //System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/geckodriver");

        // using chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/chromedriver");

        driver = new ChromeDriver();  //chrome
        //driver = new FirefoxDriver(); // firefox

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        // driver.get(url);  // website address (one way to get url)
        driver.navigate().to(url);

        driver.manage().window().maximize();  // commands to window
    }


    // local drivers: chrome, firefox, safari, opera etc
    public WebDriver getLocalDriver(String os, String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            if(os.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/chromedriver");
                driver = new ChromeDriver();
            }
            else if (os.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            if(os.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/geckodriver");
                driver = new FirefoxDriver();
            }else if (os.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/WebAutomationSept2020/Generic/driver/geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        else if(browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "./Generic/driver/internetexplorerdriver.exe");
            driver = new InternetExplorerDriver();

        }else if(browserName.equalsIgnoreCase("safari")){
            System.setProperty("webdriver.safari.driver", "./Generic/driver/safaridriver");
            driver = new SafariDriver();
        }
        return driver;
    }



    // cloud driver: browserstack or saucelabs

    public WebDriver getCloudDriver(String envName, String os, String os_version, String browserName, String browserVersion) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("broswer", browserName);
        cap.setCapability("brwoserVersion", browserVersion);
        cap.setCapability("OS", os);
        cap.setCapability("os_version", os_version);

        if(envName.equalsIgnoreCase("Browserstack")) {
            driver = new RemoteWebDriver(new URL("http://"+browserStackUserName+":"+browserStackAccessKey+
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        else if (envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL("http://"+sauceLabsUserName+":"+sauceLabsAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }

        return driver;
    }


    @AfterMethod
    public void cleanUp() {
        driver.close();  // closing the opened window after operation

        //  driver.quit();   // way to quit the window
    }

    public static void navigateBack(){
        driver.navigate().back();
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

    // W3Schools update method

    public String getWebText(String locator){
        String text = "";

        try {
            text = driver.findElement(By.cssSelector(locator)).getText();
        } catch (Exception ex1) {
            try {
                text = driver.findElement(By.className(locator)).getText();
            } catch (Exception ex2) {
                try {
                   text = driver.findElement(By.id(locator)).getText();
                } catch (Exception ex3) {
                   text =  driver.findElement(By.xpath(locator)).getText();
                }
            }
        }
        return text;
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



    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(1000 * sec);
    }


    //Synchronization

    public static void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public static void waitUntilClickAble(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }catch(Exception ex){
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    }

    public static void waitUntilVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitUntilSelectable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }



}