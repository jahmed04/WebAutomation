package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class Books {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getBookListFromDB() throws Exception {
        List<String> list6 = connectToSqlDB.readDataBase("BookList", "Items");
        return list6;
    }
}
