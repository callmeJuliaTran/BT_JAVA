package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình nhập key và value là số nguyên tính tổng các key lẻ

		Scanner scanner = new Scanner(System.in); // key k trung value dc trung
		Map<Integer, Integer> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			System.out.print("Nhap value");
			int value = scanner.nextInt();
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();
		int tong = 0;
		for (Integer keyvalue : set) {
			if (keyvalue % 2 != 0) {
				tong = tong + keyvalue;
			}
		}
		System.out.print(tong);

	}

}
