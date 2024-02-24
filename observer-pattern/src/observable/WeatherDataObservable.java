package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements Observable{
    List<Observer> observerList;
    int temperature;
    int humidity;

    public WeatherDataObservable() {
        observerList = new ArrayList<>();
        temperature = 30;
        humidity = 5;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this.temperature, this.humidity));
    }

    public void changeData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
