package table;

import base.CommonAPI;

public class SqlTablePage extends CommonAPI {

    public String readTableData() {

            String tableData = getWebText( ".w3-table-all.notranslate tr:nth-child(1) ");
            System.out.println(tableData);

            String tableData2 = getWebText( ".w3-table-all.notranslate tr:nth-child(2)");
            System.out.println(tableData2);

            String tableData3 = getWebText( ".w3-table-all.notranslate tr:nth-child(3)");
            System.out.println(tableData3);

            String tableData4 = getWebText( ".w3-table-all.notranslate tr:nth-child(4)");
            System.out.println(tableData4);

            String tableData5 = getWebText( ".w3-table-all.notranslate tr:nth-child(5)");
            System.out.println(tableData5);

            String tableData6 = getWebText( ".w3-table-all.notranslate tr:nth-child(6)");
            System.out.println(tableData6);


        return tableData;

    }





//    public void readTableData(){
//        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(4)");
//        System.out.println(tableData);
//    }




}
