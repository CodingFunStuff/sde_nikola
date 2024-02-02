import Behavioral.Command;
import Behavioral.CurrentConditionsDisplay;
import Behavioral.Light;
import Behavioral.LightOffCommand;
import Behavioral.LightOnCommand;
import Behavioral.RemoteControl;
import Behavioral.StatisticsDisplay;
import Behavioral.WeatherData;
import Creational.Logger;
import Creational.Person.PersonBuilder;
import Structural.BorderedShape;
import Structural.ColoredShape;
import Structural.LegacyRectangle;
import Structural.RectangleAdapter;
import Structural.Shape;

public class Main {
  public static void main(String[] args) {
    // Creational Design Patterns
    Logger logger = Logger.getInstance();
    logger.log("Starting program...");

    Creational.Person person = new PersonBuilder()
        .setName("John Doe")
        .setAge(30)
        .setAddress("123 Main St.")
        .createPerson();

    // Structural Design Patterns
    LegacyRectangle legacyRect = new LegacyRectangle(1, 2, 3, 4);
    Shape rectangle = new RectangleAdapter(legacyRect);
    BorderedShape borderedShape = new BorderedShape(rectangle, "black");
    ColoredShape coloredShape = new ColoredShape(borderedShape, "blue");

    // Behavioral Design Patterns
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);

    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOffCommand(light);
    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(lightOnCommand);
    remoteControl.buttonWasPressed();
    remoteControl.setCommand(lightOffCommand);
    remoteControl.buttonWasPressed();
  }
}
