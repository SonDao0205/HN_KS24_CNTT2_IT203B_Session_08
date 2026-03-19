package Gioi.Bai1;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(3);

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        AirConditioner ac = new AirConditioner();


        remote.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remote.setCommand(1, new FanOnCommand(ceilingFan), new FanOffCommand(ceilingFan));


        remote.pressOnButton(0);
        remote.pressOnButton(1);
        remote.pressUndo();

        remote.setCommand(2, new ACSetTemperatureCommand(ac, 20), new ACSetTemperatureCommand(ac, 26));

        remote.pressOnButton(2);
        remote.pressOffButton(2);
        remote.pressUndo();
        remote.pressUndo();
    }
}
