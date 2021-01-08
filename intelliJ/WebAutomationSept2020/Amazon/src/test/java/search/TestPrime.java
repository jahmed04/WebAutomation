package search;

import base.CommonAPI;
import datasuply.DataReader;
import datasuply.Prime;
import org.testng.annotations.Test;

import java.util.List;

public class TestPrime extends CommonAPI {
    Prime prime = new Prime();

    // prime search-bar test
    @Test
        public void primeTest() throws Exception {

        clickOnWebElement("nav-link-prime");    // id based locator  (clicking on prime button first)
            List<String> list2 = prime.getPrimeListFromDB();
            for (String items : list2) {
                typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
                clearInputField("#twotabsearchtextbox");
            }
        }


}
