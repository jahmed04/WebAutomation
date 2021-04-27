package search;

import base.CommonAPI;
import datasuply.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DropDownMenu extends CommonAPI {

//    @Test
//    public void dropDown(){
//        List<String> textList = getListOfText(".nav-search-dropdown.searchSelect option");
//        printText(textList);
//    }




    //  another way
//    @Test
//    public void dropDown(){
//        List<String> textList = getListOfText(".nav-search-dropdown.searchSelect option");
//        for(String menuText: textList) {
//            System.out.println(menuText);
//        }
//    }



    //  different way
    @Test
    public void dropDown(){
        List<WebElement> elementList = driver.findElements(By.cssSelector(".nav-search-dropdown.searchSelect option"));
        for(WebElement element: elementList){
            System.out.println(element.getText());
        }
    }



}
