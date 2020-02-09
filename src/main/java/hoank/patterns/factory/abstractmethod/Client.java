package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class Client {
    public static void main(String[] args) {
        HAbstractFactory hAbstractFactory = HFactory.getFactory(MaterialType.WOOD);
        hAbstractFactory.createChair().create();

        hAbstractFactory.createTable().create();
    }
}
