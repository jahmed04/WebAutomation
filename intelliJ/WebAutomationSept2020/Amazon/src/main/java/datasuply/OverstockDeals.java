package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class OverstockDeals {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getOverstockDealsFromDB() throws Exception {
        List<String> list13 = connectToSqlDB.readDataBase("OverstockDeals", "Items");
        return list13;
    }
}
