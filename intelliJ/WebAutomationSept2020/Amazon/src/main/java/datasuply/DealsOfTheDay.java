package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class DealsOfTheDay {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getDealsOfTheDayFromDB() throws Exception {
        List<String> list16 = connectToSqlDB.readDataBase("DealsOfTheDay", "Items");
        return list16;
    }
}
