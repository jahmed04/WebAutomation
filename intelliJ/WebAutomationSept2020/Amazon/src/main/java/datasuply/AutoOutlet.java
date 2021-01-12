package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class AutoOutlet {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getAutoOutletFromDB() throws Exception {
        List<String> list10 = connectToSqlDB.readDataBase("AutoOutlet", "Items");
        return list10;
    }
}
