package hoank.patterns.strategy;

public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("SpellStrategy execute");
    }
}
