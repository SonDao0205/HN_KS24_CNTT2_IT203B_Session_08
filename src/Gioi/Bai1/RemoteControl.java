package Gioi.Bai1;

import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undoStack;

    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        undoStack = new Stack<>();

        // Khởi tạo bằng lệnh trống (NoCommand) để tránh lỗi NullPointerException
        Command noCommand = new Command() {
            public void execute() {}
            public void undo() {}
        };
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoStack.push(onCommands[slot]);
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoStack.push(offCommands[slot]);
    }

    public void pressUndo() {
        if (!undoStack.isEmpty()) {
            Command lastCommand = undoStack.pop();
            System.out.print("[Undo] -> ");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo!");
        }
    }
}