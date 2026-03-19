package XuatSac.Bai1.sensors;

import XuatSac.Bai1.interfaces.Observer;
import XuatSac.Bai1.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int currentTemp;

    public void setTemperature(int newTemp) {
        System.out.println("\nCảm biến: Nhiệt độ thay đổi -> " + newTemp + "°C");
        this.currentTemp = newTemp;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) { observers.add(observer); }

    @Override
    public void detach(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(currentTemp);
        }
    }
}
