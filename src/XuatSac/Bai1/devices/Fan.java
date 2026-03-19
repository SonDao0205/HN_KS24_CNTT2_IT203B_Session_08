package XuatSac.Bai1.devices;

import XuatSac.Bai1.interfaces.Observer;

public class Fan implements Observer {
    private String speed;

    public void setSpeed(String speed) {
        this.speed = speed;
        System.out.println("Quạt: Tốc độ = " + speed);
    }

    @Override
    public void update(int roomTemp) {
        if (roomTemp > 30) {
            this.speed = "MẠNH";
            System.out.println("Quạt: Nhiệt độ cao (" + roomTemp + "°C), tự động chuyển sang tốc độ MẠNH.");
        }
    }

    public String getStatus() {
        return "Quạt: Tốc độ = " + speed;
    }
}
