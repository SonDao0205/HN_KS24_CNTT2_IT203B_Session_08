package XuatSac.Bai1.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
