package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends CommonAPI {

    @Test
    public void test1() {
        List<String> list = SearchItems.getSearchItems();

        for(String items: list) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);  // one way to do it
            clearInputField("#twotabsearchtextbox");

//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);  // entering the keyword
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
        }
    }
}
