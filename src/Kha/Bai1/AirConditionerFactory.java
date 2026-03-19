package Kha.Bai1;

public class AirConditionerFactory extends DeviceFactory{
    @Override
    public void createDevice() {
        System.out.println("Air conditioner is created");
    }
}
