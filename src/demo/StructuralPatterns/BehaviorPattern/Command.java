package demo.StructuralPatterns.BehaviorPattern;

public class Command {
    static void main(String[] args) {
        Light light = new Light();
        LightCommand on = new TurnOnLight(light);
        LightCommand off = new TurnOffLight(light);

        RemoteLight remoteLight = new RemoteLight();
        remoteLight.setLightCommand(on);
        remoteLight.pressPowerButton();
        remoteLight.undoButton();
    }
}

class Light{
    public void turnOn(){
        System.out.println("Turn on");
    }

    public void turnOff(){
        System.out.println("Turn off");
    }
}

// lệnh
interface LightCommand{
    void execute();
    void undo();
}

class TurnOnLight implements LightCommand{
    private Light light;
    public TurnOnLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

class TurnOffLight implements LightCommand{
    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

class RemoteLight{
    private LightCommand lightCommand;
    public void setLightCommand(LightCommand lightCommand){
        this.lightCommand = lightCommand;
    }

    public void pressPowerButton(){
        lightCommand.execute();
    }

    public void undoButton(){
        lightCommand.undo();
    }
}