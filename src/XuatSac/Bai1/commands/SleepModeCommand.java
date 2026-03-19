package XuatSac.Bai1.commands;

import XuatSac.Bai1.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class SleepModeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        System.out.println("--- Kích hoạt SleepMode ---");
        for (Command command : commands) {
            command.execute();
        }
    }
}
