package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class MoreOutlets {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getMoreOutletsFromDB() throws Exception {
        List<String> list12 = connectToSqlDB.readDataBase("MoreOutlets", "Items");
        return list12;
    }
}
