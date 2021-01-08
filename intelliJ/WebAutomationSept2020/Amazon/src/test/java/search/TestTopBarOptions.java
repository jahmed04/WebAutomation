package search;

import base.CommonAPI;
import datasuply.BestSellers;
import datasuply.FindAGift;
import datasuply.NewReleases;
import org.testng.annotations.Test;

import java.util.List;

public class TestTopBarOptions extends CommonAPI {
    BestSellers bestSellers = new BestSellers();
    NewReleases newReleases = new NewReleases();
    FindAGift findAGift = new FindAGift();

    // finding your order test
    @Test
    public void findYourOrderTest() {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(4)");  // clicking on customer service
        clickOnWebElement("div.a-box.self-service-rich-card");  // clicking on your order
    }

    // best seller items test
    @Test
    public void bestSellers() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(2)");  // best seller

        List<String> list3 = bestSellers.getBestSellersFromDB();
        for (String items : list3) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void newReleases() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(5)");     // new releases

        List<String> list4 = newReleases.getNewReleasesFromDB();
        for (String items : list4) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void findAGift() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(6)");   // find a gift

        List<String> list5 = findAGift.getGiftListFromDB();
        for (String items : list5) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }


    @Test
    public void booksSection() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(8)");  //  books
    }

    @Test
    public void fashion() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(12)");  // fashion
    }

    @Test
    public void amzonBasics() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(11)");  // amazon basics
    }


//    @Test
//    public void section() throws Exception {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(9)");  //
//    }



    // locators are slightly different in mac vs windows amazon pages

}
