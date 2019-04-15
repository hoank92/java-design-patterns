package hoank.patterns.observer;

public class Generic implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                System.out.println("generic cold");
                break;
            case RAINY:
                System.out.println("generic rainny");
                break;
            case SUNNY:
                System.out.println("generic sunny");
                break;
            case WINDY:
                System.out.println("generic windy");
                break;
            default:
                break;
        }
    }
}
