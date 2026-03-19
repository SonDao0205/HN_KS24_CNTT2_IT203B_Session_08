package XuatSac.Bai1;

import XuatSac.Bai1.commands.*;
import XuatSac.Bai1.devices.*;
import XuatSac.Bai1.sensors.TemperatureSensor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        Fan fan = new Fan();
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.attach(ac);
        sensor.attach(fan);

        SleepModeCommand sleepMode = new SleepModeCommand();
        sleepMode.addCommand(new LightOffCommand(light));
        sleepMode.addCommand(new SetACTempCommand(ac, 28));
        sleepMode.addCommand(new SetFanLowCommand(fan));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU ĐIỀU KHIỂN ---");
            System.out.println("1. Kích hoạt chế độ Ngủ");
            System.out.println("2. Giả lập thay đổi nhiệt độ");
            System.out.println("3. Xem trạng thái thiết bị");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sleepMode.execute();
                    break;
                case 2:
                    System.out.print("Nhập nhiệt độ môi trường mới: ");
                    int temp = scanner.nextInt();
                    sensor.setTemperature(temp);
                    break;
                case 3:
                    System.out.println(ac.getStatus());
                    System.out.println(fan.getStatus());
                    break;
                case 0:
                    return;
            }
        }
    }
}
