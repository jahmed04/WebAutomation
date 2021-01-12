package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class AmazonMusic {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getAmazonMusicFromDB() throws Exception {
        List<String> list19 = connectToSqlDB.readDataBase("AmazonMusic", "Items");
        return list19;
    }
}
