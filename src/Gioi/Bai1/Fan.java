package Gioi.Bai1;

public class Fan implements Device {
    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }
}
