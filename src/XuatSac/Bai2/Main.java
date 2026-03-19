package XuatSac.Bai2;

import XuatSac.Bai2.factory.MobileAppFactory;
import XuatSac.Bai2.factory.POSFactory;
import XuatSac.Bai2.factory.WebsiteFactory;
import XuatSac.Bai2.interfaces.SalesChannelFactory;
import XuatSac.Bai2.services.OrderService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesChannelFactory factory = null;

        System.out.println("HỆ THỐNG BÁN HÀNG ĐA KÊNH");
        System.out.println("1. Website\n2. Mobile App\n3. POS tại cửa hàng");
        System.out.print("Chọn kênh: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                factory = new WebsiteFactory();
                System.out.println("Bạn đã chọn kênh Website");
                break;
            case 2:
                factory = new MobileAppFactory();
                System.out.println("Bạn đã chọn kênh Mobile App");
                break;
            case 3:
                factory = new POSFactory(); // Giả sử đã tạo
                System.out.println("Bạn đã chọn kênh POS");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }

        OrderService orderService = new OrderService(factory);

        // Giả lập nhập đơn hàng
        sc.nextLine(); // Clear buffer
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        int qty = sc.nextInt();

        orderService.processOrder(name, price, qty);
    }
}
