package Gioi.Bai1;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
