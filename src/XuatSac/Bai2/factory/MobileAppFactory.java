package XuatSac.Bai2.factory;

import XuatSac.Bai2.implementations.discount.FirstTimeDiscount;
import XuatSac.Bai2.implementations.notification.PushNotification;
import XuatSac.Bai2.implementations.payment.MomoPayment;
import XuatSac.Bai2.interfaces.*;
public class MobileAppFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscountStrategy() { return new FirstTimeDiscount(); }
    public PaymentMethod createPaymentMethod() { return new MomoPayment(); }
    public NotificationService createNotificationService() { return new PushNotification(); }
}
