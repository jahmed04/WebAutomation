package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class WholeFoods {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getWholeFoodsFromDB() throws Exception {
        List<String> list26 = connectToSqlDB.readDataBase("WholeFoods", "Items");
        return list26;
    }
}
