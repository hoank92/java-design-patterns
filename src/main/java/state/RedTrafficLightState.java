package state;

/**
 * Created by hoank92 on Jun, 2019
 */
public class RedTrafficLightState extends State {
    private TrafficLightContext trafficLight;

    public RedTrafficLightState(TrafficLightContext trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning traffic light to green...");
        trafficLight.setState(trafficLight.getGreenLightState());
    }

    public String toString() {
        return "Traffic light is on red.";
    }
}
