package XuatSac.Bai1.commands;

import XuatSac.Bai1.devices.Fan;
import XuatSac.Bai1.interfaces.Command;

public class SetFanLowCommand implements Command {
    private Fan fan;
    public SetFanLowCommand(Fan fan) { this.fan = fan; }
    @Override public void execute() { fan.setSpeed("THẤP"); }
}
