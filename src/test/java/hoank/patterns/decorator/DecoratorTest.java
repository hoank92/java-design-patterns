package hoank.patterns.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void DecoratorTest() {
        Computer computer = new Computer();

        computer = new Disk(computer);
        computer = new Monitor(computer);

        System.out.println(computer.description());
    }
}
