package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class KindleBooks {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getKindleBooksFromDB() throws Exception {
        List<String> list23 = connectToSqlDB.readDataBase("KindleBooks", "Items");
        return list23;
    }
}
