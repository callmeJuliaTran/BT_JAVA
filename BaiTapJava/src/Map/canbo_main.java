package Map;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

public class canbo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xây dựng lớp Canbo mô tả thông tin về cán bộ, bao gồm các thuộc tính: Mã cán bộ,
//		họ tên, giới tính (nam hoặc nữ). Viết các phương thức cho lớp Canbo bao gồm:
//		- Nhập dữ liệu cho các thuộc tính.(nhập 5 cán bộ)
//		- Hiển thị thông tin của cán bộ
//		- Trả về giá trị  thuộc tính họ tên của cán bộ
//
//

		Scanner scanner = new Scanner(System.in);
		Map<String, canbo> map = new HashMap<>();
		System.out.print("Nhap so luong can bo");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma");
			String ma = scanner.nextLine();
			System.out.print("Nhap ten");
			String ten = scanner.nextLine();
			System.out.print("Nhap gioi tinh");
			String gt = scanner.nextLine();
			map.put(ma, new canbo(ma, ten, gt));
		}
		Set<String> set = map.keySet();
		for (String i : set) {
			System.out.print(
					" MA: " + map.get(i).getMa() + " TEN: " + map.get(i).getTen() + " GIOI TINH: " + map.get(i).getGt());
		}
	}
}
