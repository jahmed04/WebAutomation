package features;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;
import pages.SearchPage;
import pages.SectionPage;
import pages.SignUpPage;

import java.io.IOException;

public class AllFunctionality {

    LandingPage landingPage = null;
    SectionPage sectionPage = null;
    SearchPage searchPage = null;
    SignUpPage signUpPage = null;

    public void signUp(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        landingPage.clickOnSignUp();
        signUpPage.enterEmailAddress("abc123@gmail.com");
        signUpPage.clickOnSignUp();
    }

    public void search(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnSearchButton();
    }

    public void clickOnSectionMenu(WebDriver driver) throws InterruptedException{
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionsMenu(WebDriver driver) throws InterruptedException {    // clicking into different sections

        clickOnSectionMenu(driver);
        sectionPage = PageFactory.initElements(driver, SectionPage.class);

        sectionPage.gotoNewsPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.goToMetroPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoSportsPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoOpinionPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.goToEntertainmentPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoFashionPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoLivingPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoMediaPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoTechPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoRealEstatePage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoVideoPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoPhotoPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoPageSixPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);

        sectionPage.gotoShoppingPage(driver).clickOnHeadLineNews();


    }

    public void select(String featureName, WebDriver driver)throws InterruptedException, IOException {
        switch(featureName){
            case "signUp":
                signUp(driver);
                break;
            case "sectionsMenu":
                sectionsMenu(driver);
                break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }


}
