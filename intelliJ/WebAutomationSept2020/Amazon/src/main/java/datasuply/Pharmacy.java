package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class Pharmacy {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getPharmacyListFromDB() throws Exception {
        List<String> list17 = connectToSqlDB.readDataBase("PharmacyList", "Items");
        return list17;
    }
}
