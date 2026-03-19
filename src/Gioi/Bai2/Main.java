package Gioi.Bai2;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        Fan livingRoomFan = new Fan();
        Humidifier masterHumidifier = new Humidifier();

        sensor.attach(livingRoomFan);
        sensor.attach(masterHumidifier);

        sensor.setTemperature(18);
        sensor.setTemperature(23);
        sensor.setTemperature(30);
    }
}
