package XuatSac.Bai2.factory;

import XuatSac.Bai2.implementations.discount.WebsiteDiscount;
import XuatSac.Bai2.implementations.notification.EmailNotification;
import XuatSac.Bai2.implementations.payment.CreditCardPayment;
import XuatSac.Bai2.interfaces.*;

public class WebsiteFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscountStrategy() { return new WebsiteDiscount(); }
    public PaymentMethod createPaymentMethod() { return new CreditCardPayment(); }
    public NotificationService createNotificationService() { return new EmailNotification(); }
}
