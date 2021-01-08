package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class NewReleases {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getNewReleasesFromDB() throws Exception {
        List<String> list4 = connectToSqlDB.readDataBase("NewReleases", "Items");
        return list4;
    }
}
