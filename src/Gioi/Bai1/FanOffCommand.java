package Gioi.Bai1;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOff();
    }

    @Override
    public void undo() {
        this.fan.turnOn();
    }
}
