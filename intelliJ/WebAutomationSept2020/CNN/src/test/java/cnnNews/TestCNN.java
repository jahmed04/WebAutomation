package cnnNews;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCNN extends CommonAPI {

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("svg.search-icon-svg")).click();    // clicking the menu
        //driver.findElement(By.id("twotabsearchtextbox")).clear();
    }



//    @Test
//    public void test1 () {
//
//    }
}
