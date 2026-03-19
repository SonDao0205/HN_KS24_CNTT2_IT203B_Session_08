package Gioi.Bai2;

public class Fan implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature < 20) {
            System.out.println("-> Quạt: Tắt (Trời lạnh quá!).");
        } else if (temperature <= 25) {
            System.out.println("-> Quạt: Chạy ở mức trung bình.");
        } else {
            System.out.println("-> Quạt: Chạy mức tối đa (Trời nóng!).");
        }
    }
}
