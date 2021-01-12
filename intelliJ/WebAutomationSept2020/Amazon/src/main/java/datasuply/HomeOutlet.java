package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class HomeOutlet {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getHomeOutletFromDB() throws Exception {
        List<String> list8 = connectToSqlDB.readDataBase("HomeOutlet", "Items");
        return list8;
    }
}
