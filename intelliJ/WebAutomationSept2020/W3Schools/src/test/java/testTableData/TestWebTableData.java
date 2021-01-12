package testTableData;

import org.testng.annotations.Test;
import table.SqlTablePage;

public class TestWebTableData extends SqlTablePage {

    @Test
    public void readWebText() {
        readTableData();
    }

//    @Test
//    public void selectSQL() {
//        clickOnWebElement("div.w3-bar-item.w3-button a:nth-child(1)");
//    }

}