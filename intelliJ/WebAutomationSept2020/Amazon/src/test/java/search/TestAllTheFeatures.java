package search;

import base.CommonAPI;
import datasuply.*;
import org.testng.annotations.Test;
import java.util.List;

public class TestAllTheFeatures extends CommonAPI {

    BestSellers bestSellers = new BestSellers();
    NewReleases newReleases = new NewReleases();
    FindAGift findAGift = new FindAGift();
    Books books = new Books();
    Fashion fashion = new Fashion();
    Pharmacy pharmacy = new Pharmacy();
    Prime prime = new Prime();
    HomeOutlet homeOutlet = new HomeOutlet();
    KitchenOutlet kitchenOutlet = new KitchenOutlet();
    AutoOutlet autoOutlet = new AutoOutlet();
    ElectronicsOutlet electronicsOutlet = new ElectronicsOutlet();
    MoreOutlets moreOutlets = new MoreOutlets();
    OverstockDeals overstockDeals = new OverstockDeals();
    MensFavorite mensFavorite = new MensFavorite();
    WomenFavorite womenFavorite = new WomenFavorite();
    DealsOfTheDay dealsOfTheDay = new DealsOfTheDay();
    MoversAndShakers moversAndShakers = new MoversAndShakers();
    AmazonMusic amazonMusic = new AmazonMusic();
    EchoAndAlexa echoAndAlexa = new EchoAndAlexa();
    FireTablets  fireTablets = new FireTablets();
    KindleBooks kindleBooks = new KindleBooks();
    AppstoreAndroid appstoreAndroid = new AppstoreAndroid();
    AudibleBooks audibleBooks = new AudibleBooks();
    WholeFoods wholeFoods = new WholeFoods();

    // nav bar functions
    @Test
    public void bestSellers() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(2)");  // best seller
        List<String> list3 = bestSellers.getBestSellersFromDB();
        for (String items : list3) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

//    @Test
//    public void primeSection() throws Exception {
//        clickOnWebElement("nav-link-prime");
//        List<String> list2 = prime.getPrimeListFromDB();
//        for (String items : list2) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void newReleases() throws Exception {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(5)");     // new releases
//        List<String> list4 = newReleases.getNewReleasesFromDB();
//        for (String items : list4) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void findAGift() throws Exception {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(6)");   // find a gift
//
//        List<String> list5 = findAGift.getGiftListFromDB();
//        for (String items : list5) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void booksSection() throws Exception {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(8)");  //  books
//        clickOnWebElement("div.a-column.a-span12.apb-browse-left-nav.apb-browse-col-pad-right.a-span-last"); //
//        List<String> list6 = books.getBookListFromDB();
//        for (String items : list6) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void customerActivewear() throws Exception {
//        clickOnWebElement("div.a-cardui-body");             // customer-loved activewear
//        List<String> list7 = fashion.getFashionListFromDB();
//        for (String items : list7) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void shopActivewear() throws Exception {
//        clickOnWebElement("a.a-link-normal.see-more.truncate-1line");    // bottom line shopping section
//        List<String> list7 = fashion.getFashionListFromDB();
//        for (String items : list7) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void homeOutlet() throws Exception {
//        clickOnWebElement("div.a-section.a-spacing-none.quadrant-container.quadrant-container-0");  //  home outlet
//        List<String> list8 = homeOutlet.getHomeOutletFromDB();
//        for (String items : list8) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void kitchenOutlet() throws Exception {
//        clickOnWebElement("div.a-section.a-spacing-none.quadrant-container.quadrant-container-1");    //  auto outlet
//        List<String> list9 = kitchenOutlet.getKitchenOutletFromDB();
//        for (String items : list9) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void autoOutlet() throws Exception {
//        clickOnWebElement("span.a-size-small.a-color-base.aok-align-center.aok-inline-block");     //  auto outlet
//        List<String> list10 = autoOutlet.getAutoOutletFromDB();
//        for (String items : list10) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void electronicsOutlet () throws Exception {
//        clickOnWebElement("span.a-size-small.a-color-base.aok-align-center.aok-inline-block");  // electronic outlet
//        List<String> list11 = electronicsOutlet.getElectronicsOutletFromDB();
//        for (String items : list11) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void moreOutlets() throws Exception {
//        clickOnWebElement("a.a-link-normal.see-more.truncate-1line");    // see more outlets
//        List<String> list12 = moreOutlets.getMoreOutletsFromDB();
//        for (String items : list12) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void overstockDeals() throws Exception {
//        clickOnWebElement("div.a-section.a-spacing-none.image-label.truncate-2line");    // overstock deals
//        List<String> list13 = overstockDeals.getOverstockDealsFromDB();
//        for (String items : list13) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void mensFavorite() throws Exception {
//        clickOnWebElement("div.a-cardui-footer a:nth-child(1)");        // mens favorite
//        List<String> list14 = mensFavorite.getMensFavoriteFromDB();
//        for (String items : list14) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void womenFavorite() throws Exception {
//        clickOnWebElement("a.a-link-normal.see-more.truncate-1line");  // women favorite
//        List<String> list15 = womenFavorite.getWomenFavoriteFromDB();
//        for (String items : list15) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void dealsOfTheDay() throws Exception {
//        clickOnWebElement("div#desktop-grid-6 div:nth-child(3)");     //deals of the day
//        List<String> list16 = dealsOfTheDay.getDealsOfTheDayFromDB();
//        for (String items : list16) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void fashion() throws Exception {
//        //clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(13)");
//        typeOnWebElementNHitEnter("#twotabsearchtextbox", "Fashion");
//        clearInputField("#twotabsearchtextbox");
//        List<String> list7 = fashion.getFashionListFromDB();
//        for (String items : list7) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    // clicking on pharmacy and how it works later
//    @Test
//    public void pharmacySection() throws Exception {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(11)");    // pharmacy
//        clickOnWebElement("div.pui-text.medium-font.normal-font-weight.text-align-left.wrap-overflow.black-color");      // how it works
//
//        List<String> list17 = pharmacy.getPharmacyListFromDB();
//        for (String items : list17) {
//            typeOnWebElementNHitEnter("#nav-bb-search", items);
//            //clearInputField("#nav-bb-search");
//        }
//    }
//
//    @Test
//    public void pharmacy() {
//        typeOnWebElementNHitEnter("#twotabsearchtextbox", "Pharmacy");
//        clickOnWebElement("div.a-section.aok-align-center");
//        clickOnWebElement("div.pui-text.medium-font.normal-font-weight.text-align-left.wrap-overflow.black-color");      // how it works
//    }
//
//    // All - dropdown functions
//    @Test
//    public void bestSellerDropdown() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible a");
//        List<String> list3 = bestSellers.getBestSellersFromDB();
//        for (String items : list3) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void newReleaseDropdown() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(3) a");
//        List<String> list4 = newReleases.getNewReleasesFromDB();
//        for (String items : list4) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void moversDropdown() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(4) a");
//        List<String> list18 = moversAndShakers.getMoversAndShakersFromDB();
//        for (String items : list18) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void primeVideo() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(7) a");     // drop-down prime
//        List<String> list2 = prime.getPrimeListFromDB();
//        for (String items : list2) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void amazonMusic() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(8) a");
//        List<String> list19 = amazonMusic.getAmazonMusicFromDB();
//        for (String items : list19) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void echoAndAlexa() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(9) a");
//        List<String> list20 = echoAndAlexa.getEchoAndAlexaFromDB();
//        for (String items : list20) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void fireTablets() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(10) a");
//        List<String> list22 = fireTablets.getFireTabletsFromDB();
//        for (String items : list22) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void kindleBooks() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(12) a");
//        List<String> list23 = kindleBooks.getKindleBooksFromDB();
//        for (String items : list23) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void audibleBooks() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(13) a");
//        List<String> list24 = audibleBooks.getAudibleBooksFromDB();
//        for (String items : list24) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void appstoreAndroid() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(14) a");
//        List<String> list25 = appstoreAndroid.getAppstoreAndroidFromDB();
//        for (String items : list25) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void wholeFoods() throws Exception {
//        clickOnWebElement("i.hm-icon.nav-sprite");
//        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(25) a");
//        List<String> list26 = wholeFoods.getWholeFoodsFromDB();
//        for (String items : list26) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
//            clearInputField("#twotabsearchtextbox");
//        }
//    }
//
//    @Test
//    public void dropDownBar() {
//        clickOnWebElement("div#nav-search-dropdown-card");   // drop down bar
//        //clickOnWebElement(".searchDropdownBox option:nth-child(2)");
//    }
//
//    @Test
//    public void addressSection() {
//        clickOnWebElement("div#nav-global-location-slot");   // select address
//    }
//
//    @Test
//    public void selectCountrySection() {
//        clickOnWebElement("div#nav-tools a:nth-child(1)");    // select country
//        clickOnWebElement("i.a-icon.a-icon-radio");          //  selecting English
//        clickOnWebElement("input.a-button-input");           // save changes
//    }
//
//    @Test
//    public void signInSection() {
//        clickOnWebElement("div#nav-tools a:nth-child(2)");   // sign-in
//    }
//
//    @Test
//    public void returnOrders() {
//        clickOnWebElement("div#nav-tools a:nth-child(3)");   // return orders
//    }
//
//    @Test
//    public void selectYourCart() {
//        clickOnWebElement("div#nav-tools a:nth-child(4)");   // selecting cart
//    }
//
//    // finding your order test
//    @Test
//    public void findYourOrderTest() {
//        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(4)");  // clicking on customer service
//        clickOnWebElement("div.a-box.self-service-rich-card");  // clicking on your order
//    }

}