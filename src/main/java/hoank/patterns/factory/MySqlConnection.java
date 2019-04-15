package hoank.patterns.factory;

public class MySqlConnection extends Connection {

    public MySqlConnection() {}

    public String description() {
        return "mysql";
    }

}
