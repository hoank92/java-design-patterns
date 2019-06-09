package state;

import java.util.concurrent.TimeUnit;

/**
 * Created by hoank92 on Jun, 2019
 */
public class Example {
    public static void main(String[] args) {

        TrafficLightContext trafficLight = new TrafficLightContext();

        while (true) {
            trafficLight.changeState();
            timer();
        }
    }

    private static void timer() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
