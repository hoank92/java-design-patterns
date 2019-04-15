package hoank.patterns.strategy;

public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("ProjectileStrategy execute");
    }
}
