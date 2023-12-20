package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình hiển thị các giá trị lớn hơn 5, các key k trùng lặp
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
		for (Integer a : set) {
			if (map.get(a) > 5) {
				System.out.print(map.get(a) + " ");
			}
		}
	}

}
