package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class WomenFavorite {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getWomenFavoriteFromDB() throws Exception {
        List<String> list15 = connectToSqlDB.readDataBase("WomenFavorite", "Items");
        return list15;
    }
}
