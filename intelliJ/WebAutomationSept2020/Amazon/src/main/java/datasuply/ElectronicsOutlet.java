package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class ElectronicsOutlet {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getElectronicsOutletFromDB() throws Exception {
        List<String> list11 = connectToSqlDB.readDataBase("ElectronicsOutlet", "Items");
        return list11;
    }
}
