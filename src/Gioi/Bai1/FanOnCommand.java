package Gioi.Bai1;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOn();
    }

    @Override
    public void undo() {

        this.fan.turnOff();
    }
}
