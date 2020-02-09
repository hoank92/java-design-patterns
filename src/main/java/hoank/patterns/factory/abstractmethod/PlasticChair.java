package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("create plastic chair");
    }
}
