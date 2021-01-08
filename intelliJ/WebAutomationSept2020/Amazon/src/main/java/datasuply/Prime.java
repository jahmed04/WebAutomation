package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class Prime {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getPrimeListFromDB() throws Exception {
        List<String> list2 = connectToSqlDB.readDataBase("PrimeList", "Shows");
        return list2;
    }
}
