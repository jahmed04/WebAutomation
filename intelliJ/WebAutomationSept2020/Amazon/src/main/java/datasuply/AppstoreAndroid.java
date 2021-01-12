package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class AppstoreAndroid {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getAppstoreAndroidFromDB() throws Exception {
        List<String> list25 = connectToSqlDB.readDataBase("AppstoreAndroid", "Items");
        return list25;
    }
}
