package hoank.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void FactoryTest() {
        Factory factory = new Factory("mysql");
        Connection connection = factory.createConnection();
        assertEquals(connection.description(), "mysql");

        Factory factory1 = new Factory("mongodb");
        Connection connection1 = factory1.createConnection();
        assertEquals(connection1.description(), "mongodb");

    }
}
