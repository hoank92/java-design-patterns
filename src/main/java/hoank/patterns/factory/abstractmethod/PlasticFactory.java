package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class PlasticFactory extends HAbstractFactory{

    public Chair createChair() {
        return new PlasticChair();
    }

    public Table createTable() {
        return new PlasticTable();
    }
}
