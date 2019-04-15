package hoank.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;

    private List<WeatherObserver> observers;

    public Weather() {
        this.currentWeather = WeatherType.SUNNY;
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    /**
     * Makes time pass for weather
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to {}." + currentWeather);
        notifyObservers();
    }

    private void notifyObservers () {
        for (WeatherObserver weatherObserver: observers) {
            weatherObserver.update(currentWeather);
        }
    }
}
