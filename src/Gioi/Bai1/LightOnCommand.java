package Gioi.Bai1;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
