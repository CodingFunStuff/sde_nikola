package Behavioral;

public class CurrentConditionsDisplay implements WeatherObserver {

  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }
}
