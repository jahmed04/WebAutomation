package datafetch;

import datasources.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String [] getDataFromExcelFile() throws IOException {

        String path = System.getProperty("user.dir" + "/Users/ahmed/intelliJ/WebAutomationSept2020/NYPost/data/nyp-test-steps.xls");
        String [] data = excelFile.fileReader2(path,0); // issue

        return data;
    }
}
