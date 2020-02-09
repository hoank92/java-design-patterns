package hoank.patterns.factory.abstractmethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("create wood chair");
    }
}
