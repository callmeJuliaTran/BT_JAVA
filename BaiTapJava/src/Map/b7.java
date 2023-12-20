package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình nhập key và value là số nguyên, tìm key nhỏ nhất

		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		int newvalue = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			System.out.print("Nhap value");
			int value = scanner.nextInt();
			if (i == 0) {
				newvalue = value;
			}
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();
		int a = 0;
		int min = newvalue; // cho min bang gia tri value dau tien
		for (Integer timmin : set) {
			if (map.get(timmin) < min) {
				min = map.get(timmin);
				a = timmin;

			}
		}
		System.out.print(a);

	}

}
