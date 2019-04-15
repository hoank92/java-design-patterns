package hoank.patterns.adapter;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setGoAlgorithm(new GoByFlying());
        vehicle.go();

        vehicle.setGoAlgorithm(new GoByDrivingAlgorithm());
        vehicle.go();
    }
}
