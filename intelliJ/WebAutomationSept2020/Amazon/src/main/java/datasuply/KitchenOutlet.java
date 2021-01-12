package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class KitchenOutlet {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getKitchenOutletFromDB() throws Exception {
        List<String> list9 = connectToSqlDB.readDataBase("KitchenOutlet", "Items");
        return list9;
    }
}
