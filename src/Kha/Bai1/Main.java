package Kha.Bai1;

public class Main {
    static void main(String[] args) {
        HardwareConnection hardwareConnection = HardwareConnection.getInstance();
        hardwareConnection.connect();
        DeviceFactory deviceFactory = new FanFactory();
        deviceFactory.createDevice();
        Device device = new Fan();
        device.turnOn();
    }
}
