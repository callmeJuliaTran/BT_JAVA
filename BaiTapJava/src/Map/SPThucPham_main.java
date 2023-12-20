package Map;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SPThucPham_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo  lớp SanPham với các thuộc tính và phương thức cơ bản.
//		tenSanPham
//		 lớp con là SanPhamThucPham và SanPhamDienTu để kế thừa từ SanPham
//		Nếu hạn sử dụng còn hơn 20 ngày, giá bán được tính bằng giá nhập cộng thêm 10%.
//		Nếu hạn sử dụng ít hơn hoặc bằng 20 ngày, giá bán được tính bằng giá nhập cộng thêm 5%.
//		Gía bán điện tử không thay đổi
		Scanner scanner = new Scanner(System.in);
		Map<String, SPThucPham> map = new HashMap<>();
		System.out.print("Nhap so luong san pham");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma san pham");
			String masp = scanner.nextLine();
			System.out.print("Nhap ten san pham");
			String tensp = scanner.nextLine();
			System.out.print("Nhap han su dung");
			String hsd = scanner.nextLine();
			System.out.print("Nhap gia nhap");
			int gianhap = scanner.nextInt();
			map.put(masp, new SPThucPham(tensp, masp, hsd, gianhap)); // Phai dung thu tu
		}
		Set<String> set = map.keySet();
		// ArrayList<SPThucPham> list = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today = LocalDate.of(2023, 11, 24);
		long ngayconlai = 0;
		double giaban = 0; // so thuc la so co dau phay
		for (String thucPham : set) {
//			SPThucPham product = map.get(thucPham);  
			LocalDate hsd = LocalDate.parse(map.get(thucPham).getHsd(), formatter);
			// long ngayconlai = today.until(hsd).getDays();
			ngayconlai = java.time.temporal.ChronoUnit.DAYS.between(today, hsd);

			if (ngayconlai > 20) {
				giaban = map.get(thucPham).getGianhap() * 0.1 + map.get(thucPham).getGianhap();
			} else if (ngayconlai > 0 && ngayconlai <= 20) {
				giaban = map.get(thucPham).getGianhap() * 0.05 + map.get(thucPham).getGianhap();
			} else if (ngayconlai < 0) {
				System.out.print(map.get(thucPham).getTensp()+ ": San pham het han su dung ");
			}
			if (ngayconlai > 0) {
				System.out.println("San pham: " + map.get(thucPham).getTensp() + " So ngay con lai: " + ngayconlai
						+ " Gia ban: " + giaban);
			}
		}

	}

}
