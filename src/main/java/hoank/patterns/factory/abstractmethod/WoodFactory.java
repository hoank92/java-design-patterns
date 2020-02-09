package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class WoodFactory extends HAbstractFactory{

    public Chair createChair() {
        return new WoodChair();
    }

    public Table createTable() {
        return new WoodTable();
    }
}
