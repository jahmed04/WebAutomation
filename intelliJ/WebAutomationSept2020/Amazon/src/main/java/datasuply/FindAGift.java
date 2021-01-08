package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class FindAGift {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getGiftListFromDB() throws Exception {
        List<String> list5 = connectToSqlDB.readDataBase("GiftList", "Items");
        return list5;
    }
}
