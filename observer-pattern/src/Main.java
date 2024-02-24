import observable.WeatherDataObservable;
import observer.AverageTemperatureDataObserver;
import observer.CurrentWeatherDataObserver;
import observer.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

        Observer averageTemperatureDataObservable = new AverageTemperatureDataObserver(weatherDataObservable);
        Observer currentWeatherDataObserver = new CurrentWeatherDataObserver(weatherDataObservable);

        weatherDataObservable.changeData(20, 10);
        delay();
        weatherDataObservable.changeData(40, 20);
        delay();
        weatherDataObservable.changeData(10, 2);
        delay();

        /*
        problems with this - restriction on all the observers to receive temp and humidity data even if they don't want it
        averageTempObserver has no use of humidity data

        alternative - pass the entire observable object and let observer decide what it wants

        Java now has a PropertyChangeListener class which pushes a PropertyChangeEvent object to Observers when any property is chnaged in Observable
        PropertyChangeEvent looks something like - {String nameOfPropertyChanged, int oldValue, int newValue}
         */
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}