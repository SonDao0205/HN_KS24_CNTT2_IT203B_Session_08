package XuatSac.Bai2.factory;

import XuatSac.Bai2.implementations.discount.MemberDiscount;
import XuatSac.Bai2.implementations.notification.PrintReceipt;
import XuatSac.Bai2.implementations.payment.CODPayment;
import XuatSac.Bai2.interfaces.*;

public class POSFactory implements SalesChannelFactory { // PHẢI CÓ: implements
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new MemberDiscount();
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new CODPayment();
    }

    @Override
    public NotificationService createNotificationService() {
        return new PrintReceipt();
    }
}
