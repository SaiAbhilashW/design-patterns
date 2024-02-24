package observer;

import observable.Observable;

public class CurrentWeatherDataObserver implements Observer{
    int currentTemperature;
    int currentHumidity;
    public CurrentWeatherDataObserver(Observable observable) {
        currentHumidity = 0;
        currentTemperature = 0;
        observable.registerObserver(this);
    }
    @Override
    public void update(int temperature, int humidity) {
        currentHumidity = humidity;
        currentTemperature = temperature;
        System.out.println("Current temperature and humidity values are - temperature : " + temperature + " , humidity : " + humidity);
    }
}
