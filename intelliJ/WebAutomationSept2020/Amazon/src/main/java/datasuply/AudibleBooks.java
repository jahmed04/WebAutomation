package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class AudibleBooks {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getAudibleBooksFromDB() throws Exception {
        List<String> list24 = connectToSqlDB.readDataBase("AudibleBooks", "Items");
        return list24;
    }
}
