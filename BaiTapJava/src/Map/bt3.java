package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		nhập map gồm key và value key là kiểu số nguyên value là string in ra các giá trị value và key
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			System.out.print("Nhap value");
			scanner.nextLine();
			String value = scanner.nextLine();
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();
		for (Integer a : set) {
			System.out.print(map.get(a));
		}

	}
}
