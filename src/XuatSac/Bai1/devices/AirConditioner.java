package XuatSac.Bai1.devices;

import XuatSac.Bai1.interfaces.Observer;

public class AirConditioner implements Observer {
    private int temperature;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: Đã set nhiệt độ = " + temp + "°C");
    }

    @Override
    public void update(int roomTemp) {
        if (roomTemp > 30) {
            System.out.println("Điều hòa: Phát hiện nhiệt độ cao (" + roomTemp + "°C), tăng cường làm lạnh.");
        }
    }

    public String getStatus() {
        return "Điều hòa: Nhiệt độ hiện tại = " + temperature + "°C";
    }
}
