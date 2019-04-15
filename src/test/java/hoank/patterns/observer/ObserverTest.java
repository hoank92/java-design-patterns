package hoank.patterns.observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void ObserverTest() {
        Weather weather = new Weather();
        Hobbits hobbits = new Hobbits();
        Generic generic = new Generic();
        weather.addObserver(hobbits);
        weather.addObserver(new Orcs());

        weather.timePasses();
        weather.addObserver(generic);
        weather.timePasses();
        weather.removeObserver(hobbits);
        weather.timePasses();
        weather.timePasses();
    }
}
