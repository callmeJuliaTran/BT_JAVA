package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class sp_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Nhập vào tên sản phẩm, số lượng và đơn giá. Tính tiền thuế giá trị gia tăng phải trả, biết rằng: 
//			 Tiền = số lượng * đơn giá
//			 Thuế giá trị gia tăng = 10% * tiền
//			 2. Tạo lớp SanPham gồm 4 thuộc tính: tên, giá , giảm giá, năm sản xuất. Lớp cũng gồm 1 phương thức là tính thuế nhập khẩu (13% giá nhập khẩu).
//			            Thông tin xuất ra màn hình gồm:
//			 o	Tên sản phẩm
//			 o	Đơn giá
//			 o	Giảm giá
//			 o	Năm sản xuất
//			 o	Thuế nhập khẩu
		Scanner scanner = new Scanner(System.in);
		Map<String, sp> map = new HashMap<>();
		System.out.print("Nhap so luong san pham");
		int n = scanner.nextInt();
		for(int i =0;i<n;i++) {
			scanner.nextLine();
		System.out.print("Nhap ten san pham");
		String ten = scanner.nextLine();
		System.out.print("Nhap so luong");
		int soluong = scanner.nextInt();
		System.out.print("Nhap gia");
		int gia = scanner.nextInt();
		System.out.print("Nhap giam gia");
		int giamgia = scanner.nextInt();
		System.out.print("Nhap nam san xuat");
		int namsx = scanner.nextInt();
		map.put(ten, new sp(ten, soluong, gia, giamgia, namsx, n));
		}
		Set<String> set = map.keySet();
		for (String i : set) {
			System.out.println(map.get(i).getTen());
		}
	}

}
