package XuatSac.Bai1.commands;

import XuatSac.Bai1.devices.Light;
import XuatSac.Bai1.interfaces.Command;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) { this.light = light; }
    @Override public void execute() { light.turnOff(); }
}
