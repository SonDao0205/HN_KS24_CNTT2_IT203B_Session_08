package Gioi.Bai1;

public class AirConditioner implements Device {
    @Override
    public void turnOff() {
        System.out.println("AirConditioner is off");
    }

    @Override
    public void turnOn() {
        System.out.println("AirConditioner is on");
    }
}
