package hoank.patterns.factory;

public class Factory {
    protected String type;

    public Factory(String type) {
        this.type = type;
    }

    public Connection createConnection() {
        if (type.equals("mysql")) {
            return new MySqlConnection();
        }
        else {
            return new MongoDbConnection();
        }
    }
}
