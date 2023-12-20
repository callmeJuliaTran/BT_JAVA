package Arraylist2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình nhập key và value các key k được trùng lặp,
		// tính tổng các value số lẻ

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
//			if (map.get(keyvalue) % 2 != 0) {
//				tong = tong + map.get(keyvalue);
//			}
//		}
			if (keyvalue == 3) {
				System.out.print(keyvalue +" " +map.get(keyvalue));
			}
		}

	}
}
