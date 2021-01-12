package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class MensFavorite {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getMensFavoriteFromDB() throws Exception {
        List<String> list14 = connectToSqlDB.readDataBase("MensFavorite", "Items");
        return list14;
    }
}
