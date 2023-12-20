package Arraylist2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình nhập key và value các key k được trùng lặp,
		// in ra các value chia hết cho 2
		Scanner scanner = new Scanner(System.in);
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
		for (Integer key : set) {
			if (map.get(key) % 2 == 0) {
				System.out.print(map.get(key) + " ");
			}
		}

	}

}
