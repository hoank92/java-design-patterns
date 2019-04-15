package hoank.patterns.factory;

public class MongoDbConnection extends Connection {
    public MongoDbConnection() {}

    public String description() {
        return "mongodb";
    }
}
