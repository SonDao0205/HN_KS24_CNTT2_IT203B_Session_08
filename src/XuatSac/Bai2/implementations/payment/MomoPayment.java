package XuatSac.Bai2.implementations.payment;

import XuatSac.Bai2.interfaces.PaymentMethod;

public class MomoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("MomoPayment processPayment");
    }
}
