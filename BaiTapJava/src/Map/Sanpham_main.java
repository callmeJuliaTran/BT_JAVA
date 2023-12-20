package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sanpham_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Map<String, Sanpham> map = new HashMap<>();
		System.out.print("Nhap so luong san pham");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma san pham");
			String masp = scanner.nextLine();
			System.out.print("Nhap ten san pham");
			String tensp = scanner.nextLine();
			map.put(masp, new Sanpham(tensp, masp));
		}
		Set<String> set = map.keySet();
		for (String i : set) {
			System.out.print(map.get(i).getMasp() + " " + map.get(i).getTensp());
		}
	}
}
