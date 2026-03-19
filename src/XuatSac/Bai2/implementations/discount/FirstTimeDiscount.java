package XuatSac.Bai2.implementations.discount;

import XuatSac.Bai2.interfaces.DiscountStrategy;

public class FirstTimeDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) { return amount * 0.15; }
}
