package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class Fashion {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getFashionListFromDB() throws Exception {
        List<String> list7 = connectToSqlDB.readDataBase("FashionList", "Items");
        return list7;
    }
}
