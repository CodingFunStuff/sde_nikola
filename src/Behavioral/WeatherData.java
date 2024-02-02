package Behavioral;

import java.util.ArrayList;

interface WeatherObserver {
  void update(float temp, float humidity, float pressure);
}

public class WeatherData {
  private final ArrayList<WeatherObserver> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  void registerObserver(WeatherObserver observer) {
    observers.add(observer);
  }

// --Commented out by Inspection START (1/10/23, 14:12):
//  void removeObserver(WeatherObserver observer) {
//    int i = observers.indexOf(observer);
//    if (i >= 0) {
//      observers.remove(i);
//    }
//  }
// --Commented out by Inspection STOP (1/10/23, 14:12)

  void notifyObservers() {
    for (WeatherObserver observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  // other Behavioral.WeatherData methods here
}

