package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLongArray;

import OOP2.khachhang;
import sun.jvm.hotspot.ui.action.FindAction;

public class Khachhang_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Để Furama vào hoạt động được thì mình phải xây dựng khu nghỉ dưỡng. Ban đầu mình xây dựng Furama 
//		có 5 cái Villa , 2 cái House và 1 hồ bơi. Một cái Villa thì có 1 cái giường . Nếu Khách có thuê cái Villa thì 
//		phải trả tiền 1 ngày là 10 USD. Một cái House thì có 4 cái giường. Nếu khách thuê 1 ngày thì trả 5 USD. 
//		Hồ bơi thì mở cửa lúc 10 sáng hằng ngày
//		Task 2: Tạo cấu trúc dự án và tạo các class (dựa vào danh từ cho ra class) cần thiết Giả sử có 1 khách 
//		hàng tên Nguyễn Văn A , 20 tuổi thuê 1 cái Villa trong 4 ngày, tính tiền cho khách hàng Nguyễn Văn A. In 
//		kết quả ra màn hình Hiển thị tên , tuổi của KH ra màn hình
//		Task 3 : Tạo 1 class Swimming hiển thị giờ mở cửa của Swimming pool là mấy giờ. In kết quả ra màn hình 
//		Nếu khách hàng đến trước 8h thì thông báo Hồ bơi chưa mở cửa , bạn hãy chờ đến 9h (if/else) Viết một 
//		hàm tính xem nếu khách hàng có 100 USD thì in thông báo họ sẽ ở được mấy ngày trong villa , nếu có 50 
//		USD thì ở được mấy ngày. Nếu 30 thì ở được mấy ngày 
//		Task 4: Giả sử có 10 khách hàng đặt phòng .Sử dụng ArrayList để lưu 10 KH 
//		Task 1 hiển thị tất cả các Khách hàng có trong Resort
//		Yêu cầu các kỷ thuật sau phải được áp dụng ArrayList
		Scanner scanner = new Scanner(System.in);
		ArrayList<Khachhang> list = new ArrayList<>();
		System.out.print("Nhap so luong khach");
		int Villa = 5;
		int House = 2;
		int hoboi = 1;
		int giuongVilla = 1;
		int giaVilla = 10;
		int giuongHouse = 4;
		int giaHouse = 5;
		int gio = 10;
		int tien = 1;

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten khach hang");
			String tenKH = scanner.nextLine();
			System.out.print("Nhap tuoi khach hang");
			int tuoiKH = scanner.nextInt();
			list.add(new Khachhang(tenKH, tuoiKH));
		}
		scanner.nextLine();
		System.out.print("Tim khach hang");
		String timKH = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTenKH().equals(timKH)) {
				System.out.print("Khach hang o villa hay house, VILLA NHAP 1 HOUSE NHAP 2");
				int choo = scanner.nextInt();
				if (choo == 1) {
					System.out.print("So ngay");
					int songay = scanner.nextInt();
					tien = songay * giaVilla;
				} else if (choo == 2) {
					System.out.print("So ngay");
					int songay = scanner.nextInt();
					tien = songay * giaHouse;
				}
				break;

			} else {
				System.out.print("Khong tim thay du lieu");
			}
		}System.out.print(tien);

	}

}
