package Arraylist2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map4_keyandvalueMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tìm key và giá trị lớn nhất
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
		int max = 0;
		int keymax=0;
		for (Integer timmax : set) {
			if (map.get(timmax) > max) {
				max = map.get(timmax);
				keymax = timmax;
			}
		}
		System.out.print(keymax + " "+ max);
	}

}
