package observer;

import observable.Observable;

public class AverageTemperatureDataObserver implements Observer{
    int sumOfTemperatures;
    int temperatureCount;
    public AverageTemperatureDataObserver(Observable observable) {
        sumOfTemperatures = 0;
        temperatureCount = 0;
        observable.registerObserver(this);
    }
    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        temperatureCount += 1;
        System.out.println("Current average temperature value is " + sumOfTemperatures/temperatureCount + " for count " + temperatureCount);
    }
}
