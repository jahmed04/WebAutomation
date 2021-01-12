package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class EchoAndAlexa {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getEchoAndAlexaFromDB() throws Exception {
        List<String> list20 = connectToSqlDB.readDataBase("EchoAndAlexa", "Items;");
        return list20;
    }
}
