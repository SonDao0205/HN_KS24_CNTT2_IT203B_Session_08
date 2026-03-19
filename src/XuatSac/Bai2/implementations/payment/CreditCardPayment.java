package XuatSac.Bai2.implementations.payment;

import XuatSac.Bai2.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Xử lý thanh toán Thẻ tín dụng: " + String.format("%,.0f", amount) + " VNĐ");
    }
}
