package datasources;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongoDB {
    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("database_name");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static void main(String[] args) {

    }
}
