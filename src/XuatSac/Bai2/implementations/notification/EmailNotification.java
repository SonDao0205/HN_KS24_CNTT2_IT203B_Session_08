package XuatSac.Bai2.implementations.notification;

import XuatSac.Bai2.interfaces.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String msg) {
        System.out.println("Gửi Email: " + msg);
    }
}
