package Kha.Bai2;

public class Main {
    static void main(String[] args) {
        OldThermometer oldThermometer = new OldThermometer();
        TemperatureSensor adapter = new ThermometerAdapter(oldThermometer);
        SmartHomeFacade smartHome = new SmartHomeFacade(adapter);
        // Xem nhiệt độ
        double temp = smartHome.getCurrentTemperature();
        int f = oldThermometer.getTemperatureFahrenheit();
        System.out.println("Nhiệt độ hiện tại: " + temp + "°C (chuyển đổi từ " + f + "°F)");

        // Chế độ rời nhà
        smartHome.sleepMode();
        // Chế độ ngủ
        smartHome.leaveHome();
    }
}
