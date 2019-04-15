package hoank.patterns.singleton;

public class DatabaseSynchronized {
    private static DatabaseSynchronized singleObject;
    private int record;
    private String name;

    private DatabaseSynchronized(String n) {
        name = n;
        record = 0;
    }

    public static synchronized DatabaseSynchronized getInstance(String n) {
        if (singleObject == null) {
            singleObject = new DatabaseSynchronized(n);
        }

        return singleObject;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + " operation on record " + record + " in database " + name);
    }

    public String getName() {
        return name;
    }
}
