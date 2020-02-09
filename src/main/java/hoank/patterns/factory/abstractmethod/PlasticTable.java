package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("create plastic table");
    }
}
