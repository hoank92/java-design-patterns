package hoank.patterns.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void StrategyTest() {
        DragonSlayer dragonSlayer = new DragonSlayer(new SpellStrategy());
        dragonSlayer.getExecute();

        dragonSlayer.changeDragonSlayer(new ProjectileStrategy());
        dragonSlayer.getExecute();

        dragonSlayer = new DragonSlayer(() -> System.out.println("hoank123"));

        dragonSlayer.changeDragonSlayer(()-> System.out.println("hoank"));
        dragonSlayer.getExecute();
    }
}
