package features;

import datafetch.FetchTheSteps;
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
    private Object WebDriver;

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

    public void sectionsMenu(WebDriver driver) throws InterruptedException, IOException {    // clicking into different sections

        clickOnSectionMenu(driver);
        sectionPage = PageFactory.initElements(driver, SectionPage.class);

        // these two lines

//        String headLineNews = sectionPage.goToMetroPage(driver).getHeadLineNewsText();  // issue
//        System.out.println(headLineNews);
        clickOnSectionMenu(driver);

        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);
        sectionPage.goToEntertainmentPage(driver).clickOnHeadLineNews();





        // before adding excel file test update


//        clickOnSectionMenu(driver);
//        sectionPage = PageFactory.initElements(driver, SectionPage.class);
//
//        sectionPage.gotoNewsPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.goToMetroPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoSportsPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoOpinionPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.goToEntertainmentPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoFashionPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoLivingPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoMediaPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoTechPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoRealEstatePage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoVideoPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoPhotoPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoPageSixPage(driver).clickOnHeadLineNews();
//        clickOnSectionMenu(driver);
//
//        sectionPage.gotoShoppingPage(driver).clickOnHeadLineNews();
//
//
//    }

    //  excel file related method

//        public void runAllTheFeatureTest (WebDriver driver) throws InterruptedException,IOException {
//            FetchTheSteps fetchTheSteps = new FetchTheSteps();
//            String [] featureSteps = fetchTheSteps.getDataFromExcelFile();   // issue
//
//            for (int i=1; i< featureSteps.length; i++) {
//                select2(featureSteps[i], driver );
//            }
//        }
//        public void select2(String featureName, WebDriver driver) throws InterruptedException, IOException {
//            switch(featureName){
//                case "metro":
//                    signUp(driver);
//                    break;
//                case "business":
//                    sectionsMenu(driver);
//                    break;
//                case "entertainment":
//                    search(driver);
//                    break;
//                default:
//                    throw new InvalidArgumentException("Invalid features choice");
//            }
//        }





//    public void runAllTheFeatureTest (WebDriver driver) throws InterruptedException,IOException {
//        FetchTheSteps fetchTheSteps = new FetchTheSteps();
//        String [] featureSteps = fetchTheSteps.getDataFromExcelFile();   // issue
//
//        for (int i=1; i< featureSteps.length; i++) {
//            select(featureSteps[i], driver );
//        }
//    }
//    public void select(String featureName, WebDriver driver) throws InterruptedException, IOException {
//        switch(featureName){
//            case "signUp":
//                signUp(driver);
//                break;
//            case "sectionsMenu":
//                sectionsMenu(driver);
//                break;
//            case "search":
//                search(driver);
//                break;
//            default:
//                throw new InvalidArgumentException("Invalid features choice");
//        }
    }


}
