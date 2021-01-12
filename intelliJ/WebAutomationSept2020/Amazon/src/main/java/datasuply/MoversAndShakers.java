package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class MoversAndShakers {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getMoversAndShakersFromDB() throws Exception {
        List<String> list18 = connectToSqlDB.readDataBase("MoversAndShakers", "Items");
        return list18;
    }
}
