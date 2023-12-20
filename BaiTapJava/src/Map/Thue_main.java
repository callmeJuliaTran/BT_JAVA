package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Thue_main {

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
		Map<String, Thue> map = new LinkedHashMap<>(); //
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
		map.put(ten, new Thue(ten, soluong, gia));
		}
		Set<String> set = map.keySet();
		float tien = 0;
		float thue = 0;
		for (String i : set) {
			tien = map.get(i).getGia() * map.get(i).getSoluong();
			thue = (float) (tien*0.1) ;
			System.out.println("TEN: " + map.get(i).getTen() + " GIA: $" + tien + " " + thue);
		}
	}

}
