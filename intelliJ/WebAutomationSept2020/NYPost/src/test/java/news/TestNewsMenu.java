package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNewsMenu extends CommonAPI {


    @Test
    public void test1() {

        clickOnWebElement("svg.menu-icon-svg");


        // driver.findElement(By.cssSelector("svg.icon menu-icon-svg")).click();  // clicking the menu
        // driver.findElement(By.id("twotabsearchtextbox")).clear();
    }
}
