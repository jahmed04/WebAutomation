package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class BestSellers {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getBestSellersFromDB() throws Exception {
        List<String> list3 = connectToSqlDB.readDataBase("BestSellers", "Items");
        return list3;
    }
}
