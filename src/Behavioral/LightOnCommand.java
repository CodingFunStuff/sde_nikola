package Behavioral;

import Behavioral.Command;
import Behavioral.Light;

public class LightOnCommand implements Command {

  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}

