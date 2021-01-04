package news;

import base.CommonAPI;
import features.AllFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SectionPage;

import java.io.IOException;

public class TestNewsSection extends CommonAPI {


    // excel file related test

    @Test
    public void allFeatures() throws InterruptedException, IOException {
        AllFunctionality functionality = PageFactory.initElements(driver, AllFunctionality.class);
        functionality.runAllTheFeatureTest(driver);  // issue

    }

    // section menu test for all the pages I did

//    @Test
//    public void allFeatures() throws InterruptedException {
//        AllFunctionality functionality = PageFactory.initElements(driver, AllFunctionality.class);
//        functionality.sectionsMenu(driver);
//
//    }



    //  only metro page test
//    @Test
//    public void metroFeatures(){
//        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
//        sectionPage.goToMetroPage(driver);
//
//    }

}
