package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionPage {

    // locators for each NYPost section menu

    @FindBy(how = How.CSS, using = "#sections > span.pages.menu-icon > svg")  //  locator for section button
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(1) a")  // news - 1
    public static WebElement newsMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a") // metro - 2
    public static WebElement metroMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4) a")  // sports - 4
    public static WebElement sportsMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(5) a")  // business - 5
    public static WebElement businessMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(6) a")  // opinion - 6
    public static WebElement opinionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a") // entertainment - 7
    public static WebElement entertainmentMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(8) a")  // fashion - 8
    public static WebElement fashionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(10) a")  // Living - 10
    public static WebElement livingMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(11) a")  // Media - 11
    public static WebElement mediaMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(12) a")  // Tech - 12
    public static WebElement techMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(13) a")  // Real Estate - 13
    public static WebElement realEstateMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(14) a")  // Video - 14
    public static WebElement videoMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(15) a")  // Photos - 15
    public static WebElement photosMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(9) a")  // NY Post Shopping - 9
    public static WebElement shoppingMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(3) a")  // page six - 3
    public static WebElement pageSixMenuWebElement;



    public WebElement getSectionMenuWebElement(){ return sectionMenuWebElement;}

    public WebElement getNewsMenuWebElement() { return newsMenuWebElement;}

    public WebElement getMetroMenuWebElement(){ return metroMenuWebElement;}

    public WebElement getSportsMenuWebElement(){
        return sportsMenuWebElement;
    }

    public WebElement getBusinessMenuWebElement(){ return businessMenuWebElement;}

    public WebElement getOpinionMenuWebElement() { return opinionMenuWebElement;}

    public WebElement getEntertainmentMenuWebElement(){return entertainmentMenuWebElement;}

    public WebElement getFashionMenuWebElement() { return fashionMenuWebElement;}

    public WebElement getLivingMenuWebElement() { return livingMenuWebElement;}

    public WebElement getMediaMenuWebElement() { return mediaMenuWebElement;}

    public WebElement getTechMenuWebElement() { return techMenuWebElement;}

    public WebElement getRealEstateMenuWebElement() { return realEstateMenuWebElement;}

    public  WebElement getVideoMenuWebElement() { return videoMenuWebElement;}

    public WebElement getPhotosMenuWebElement() { return photosMenuWebElement;}

    public WebElement getShoppingMenuWebElement() { return shoppingMenuWebElement;}

    public WebElement getPageSixMenuWebElement() { return pageSixMenuWebElement;}



    public void clickOnSectionMenuTab(){
        getSectionMenuWebElement().click();
    }

    public NewsPage gotoNewsPage (WebDriver driver) {
        getNewsMenuWebElement().click();
        return new NewsPage(driver);
    }

    public MetroPage goToMetroPage(WebDriver driver){
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }


    public SportsPage gotoSportsPage (WebDriver driver) {
        getSportsMenuWebElement().click();
        return new SportsPage(driver);
    }

    public BusinessPage goToBusinessPage(WebDriver driver)throws InterruptedException{
        try {
            getBusinessMenuWebElement().click();
        }catch (Exception ex){
            CommonAPI.navigateBack();
            Thread.sleep(1000);
            getBusinessMenuWebElement().click();
        }
        return new BusinessPage(driver);
    }

    public OpinionPage gotoOpinionPage (WebDriver driver) {
        getOpinionMenuWebElement().click();
        return new OpinionPage(driver);
    }

    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        getEntertainmentMenuWebElement().click();
        return new EntertainmentPage(driver);
    }

    public FashionPage gotoFashionPage (WebDriver driver) {
        getFashionMenuWebElement().click();
        return new FashionPage(driver);
    }

    public LivingPage gotoLivingPage (WebDriver driver) {
        getLivingMenuWebElement().click();
        return new LivingPage(driver);
    }

    public MediaPage gotoMediaPage (WebDriver driver) {
        getMediaMenuWebElement().click();
        return new MediaPage(driver);
    }

    public TechPage gotoTechPage (WebDriver driver) {
        getTechMenuWebElement().click();
        return new TechPage(driver);
    }

    public RealEstatePage gotoRealEstatePage (WebDriver driver) {
        getRealEstateMenuWebElement().click();
        return new RealEstatePage(driver);
    }

    public VideoPage gotoVideoPage (WebDriver driver) {
        getVideoMenuWebElement().click();
        return new VideoPage(driver);
    }

    public PhotoPage gotoPhotoPage (WebDriver driver) {
        getPhotosMenuWebElement().click();
        return new PhotoPage(driver);
    }

    public ShoppingPage gotoShoppingPage (WebDriver driver) {
        getShoppingMenuWebElement().click();
        return new ShoppingPage(driver);
    }

    public PageSixPage gotoPageSixPage (WebDriver driver) {
        getPageSixMenuWebElement().click();
        return new PageSixPage(driver);
    }
}
