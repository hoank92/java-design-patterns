package hoank.patterns.adapter;

public class GoByFlying implements GoAlgorithm {
    @Override
    public void go() {
        System.out.println("Now i'm flying");
    }
}
