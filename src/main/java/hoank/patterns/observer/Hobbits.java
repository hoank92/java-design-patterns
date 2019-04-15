package hoank.patterns.observer;

public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                System.out.println("hobbits cold");
                break;
            case RAINY:
                System.out.println("hobbits rainny");
                break;
            case SUNNY:
                System.out.println("hobbits sunny");
                break;
            case WINDY:
                System.out.println("hobbits windy");
                break;
            default:
                break;
        }
    }
}
