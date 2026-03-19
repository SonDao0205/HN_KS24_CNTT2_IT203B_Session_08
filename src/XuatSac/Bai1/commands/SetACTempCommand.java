package XuatSac.Bai1.commands;

import XuatSac.Bai1.devices.AirConditioner;
import XuatSac.Bai1.interfaces.Command;

public class SetACTempCommand implements Command {
    private AirConditioner ac;
    private int temp;
    public SetACTempCommand(AirConditioner ac, int temp) { this.ac = ac; this.temp = temp; }
    @Override public void execute() { ac.setTemperature(temp); }
}
