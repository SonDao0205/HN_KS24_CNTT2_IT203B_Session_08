package Gioi.Bai1;

public class ACSetTemperatureCommand implements Command {

    private AirConditioner airConditioner;
    private int temp;
    private int oldTemp;
    public ACSetTemperatureCommand(AirConditioner airConditioner,int temp) {
        this.airConditioner = airConditioner;
        this.temp = temp;
    }


    @Override
    public void undo() {
        System.out.println("Nhiệt độ : " + oldTemp);
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
        oldTemp = temp;
        System.out.println("Nhiệt độ : " + temp);
    }
}
