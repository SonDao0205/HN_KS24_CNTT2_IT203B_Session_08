package XuatSac.Bai2.services;

import XuatSac.Bai2.interfaces.*;

public class OrderService {
    private DiscountStrategy discount;
    private PaymentMethod payment;
    private NotificationService notification;

    public OrderService(SalesChannelFactory factory) {
        this.discount = factory.createDiscountStrategy();
        this.payment = factory.createPaymentMethod();
        this.notification = factory.createNotificationService();
    }

    public void processOrder(String product, double price, int quantity) {
        double total = price * quantity;
        double discountAmount = discount.calculateDiscount(total);
        double finalAmount = total - discountAmount;

        System.out.println("\n--- XỬ LÝ ĐƠN HÀNG ---");
        System.out.println("Sản phẩm: " + product + " x " + quantity);
        System.out.println("Áp dụng giảm giá: " + String.format("%,.0f", discountAmount) + " VNĐ");
        payment.processPayment(finalAmount);
        notification.sendNotification("Đơn hàng " + product + " thành công!");
    }
}
