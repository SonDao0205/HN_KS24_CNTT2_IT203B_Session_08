package XuatSac.Bai2.implementations.notification;

import XuatSac.Bai2.interfaces.NotificationService;

public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Gửi thông báo: " + message);
    }
}
