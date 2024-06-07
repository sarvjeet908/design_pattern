package command_design;

public class Light_on_command implements Command{
    private Light light;

    public Light_on_command(Light light) {
        this.light = light;
    }
    //receiver  method  :receives act on the command
    @Override
    public void execute() {
      light.turnOn();
    }
}
