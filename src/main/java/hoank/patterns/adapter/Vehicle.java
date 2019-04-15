package hoank.patterns.adapter;

public class Vehicle {
    private GoAlgorithm goAlgorithm;
    public Vehicle () {}

    public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
        this.goAlgorithm = goAlgorithm;
    }

    public void go() {
        this.goAlgorithm.go();
    }
}
