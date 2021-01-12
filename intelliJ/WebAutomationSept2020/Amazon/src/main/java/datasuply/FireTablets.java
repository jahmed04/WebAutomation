package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class FireTablets {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getFireTabletsFromDB() throws Exception {
        List<String> list22 = connectToSqlDB.readDataBase("FireTablets", "Items");
        return list22;
    }
}
