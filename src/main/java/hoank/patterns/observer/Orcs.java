package hoank.patterns.observer;

public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                System.out.println("Orcs cold");
                break;
            case RAINY:
                System.out.println("Orcs rainny");
                break;
            case SUNNY:
                System.out.println("orcs sunny");
                break;
            case WINDY:
                System.out.println("orcs windy");
                break;
            default:
                break;
        }
    }
}
