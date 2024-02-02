# Design Patterns in Java

This program demonstrates the use of several design patterns in Java. The program includes examples of creational, structural, and behavioral design patterns.

## Creational Design Patterns - Nikola Djukic

The program includes examples of the following creational design patterns:

- Singleton: The `Creational.Logger` class uses the singleton pattern to ensure that there is only one instance of the class throughout the program's execution. This is done by making the constructor private and using a static variable to hold the instance of the class.

- Builder: The `Creational.Creational` class uses the builder pattern to construct objects with multiple optional fields. The `PersonBuilder` class is used to construct `Creational.Creational` objects with specific fields set.

## Structural Design Patterns 

The program includes examples of the following structural design patterns:

- Adapter: The `Structural.LegacyRectangle` class and the `Structural.RectangleAdapter` class use the adapter pattern to adapt the `Structural.LegacyRectangle` class to the `Structural.Rectangle` interface. This allows the legacy class to be used in conjunction with other classes that implement the `Structural.Rectangle` interface.

- Decorator: The `Structural.BorderedShape` class and the `Structural.ColoredShape` class use the decorator pattern to add functionality to the `Structural.Shape` class. The `Structural.BorderedShape` class adds a border to the shape and the `Structural.ColoredShape` class adds a color to the shape.

## Behavioral Design Patterns 

The program includes examples of the following behavioral design patterns:

- Observer: The `Behavioral.WeatherData` class and the `Behavioral.WeatherObserver` interface use the observer pattern to notify registered observers of changes to the weather data. The `Behavioral.CurrentConditionsDisplay` and `Behavioral.StatisticsDisplay` classes are examples of classes that implement the `Behavioral.WeatherObserver` interface.

- Command: The `Behavioral.RemoteControl` class and the `Command` interface use the command pattern to separate the implementation of specific commands from the object that invokes them. The `Behavioral.LightOnCommand` and `LightOffCommand` classes are examples of classes that implement the `Command` interface.

## Cooperation with Team Member (Done by 1 person, myself)

In this case it has been done by myself. Ensured that the program met the requirements, reviewed and tested the code thoroughly. 

## Running the Program

To run the program, you can use the following command:

java Main

