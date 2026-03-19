package Kha.Bai1;

import Kha.Bai2.TemperatureSensor;

public class HardwareConnection {
    private static HardwareConnection instance;

    private HardwareConnection() {
    }

    public static HardwareConnection getInstance() {
        if (instance == null) {
            instance = new HardwareConnection();
        }
        return instance;
    }

    void connect(){
        System.out.println("Đã kết nối");
    }

    void disconnect(){
        System.out.println("Ngắt kết nối");
    }
}
