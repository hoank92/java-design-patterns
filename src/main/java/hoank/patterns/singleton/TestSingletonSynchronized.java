package hoank.patterns.singleton;

public class TestSingletonSynchronized implements Runnable {
    Thread thread;

    public TestSingletonSynchronized() {
        DatabaseSynchronized database;
        database = DatabaseSynchronized.getInstance("products");
        thread = new Thread(this, "second");
        thread.start();
        database.editRecord("hoank");

        System.out.println("This is the " + database.getName() + " database!");

    }
    public static void main(String[] args) {
        TestSingletonSynchronized t = new TestSingletonSynchronized();
    }

    @Override
    public void run() {

        DatabaseSynchronized database = DatabaseSynchronized.getInstance("employer");
        database.editRecord("hoank1");
        System.out.println("This is the " + database.getName() + " database!");
    }
}
