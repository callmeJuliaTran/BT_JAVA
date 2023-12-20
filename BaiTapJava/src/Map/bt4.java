package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nhập map gồm key và value key là kiểu string value là string in ra các giá
		// trị value và key
		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap key");
			String key = scanner.nextLine();
			scanner.nextLine();
			System.out.print("Nhap value");
			String value = scanner.nextLine();
			map.put(key, value);
		}

		Set<String> set = map.keySet();
		for (String a : set) {
			System.out.println(map.get(a) + " " + a);
		}
	}

}
