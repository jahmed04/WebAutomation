package search;

import base.CommonAPI;
import datasuply.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TestSearch extends CommonAPI {

    DataReader dataReader = new DataReader();
    @Test
    public void test1() throws Exception {
        List<String> list = dataReader.getItemListFromDB();
        for(String items: list) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }







//    @Test
//    public void test1() {
//        List<String> list = SearchItems.getSearchItems();
//
//        for(String items: list) {
//            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);  // one way to do it
//            clearInputField("#twotabsearchtextbox");
//
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);  // entering the keyword
////        driver.findElement(By.id("twotabsearchtextbox")).clear();
//        }
//    }



}
