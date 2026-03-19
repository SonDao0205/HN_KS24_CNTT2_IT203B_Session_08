package Gioi.Bai2;

public class Humidifier implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature > 25) {
            System.out.println("-> Máy tạo ẩm: Tăng cường phun sương (Nhiệt độ cao làm khô da).");
        } else {
            System.out.println("-> Máy tạo ẩm: Chế độ duy trì độ ẩm ổn định.");
        }
    }
}
