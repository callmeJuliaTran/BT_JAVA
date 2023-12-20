package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tìm kiếm 1 value string trong map
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap value");
			String value = scanner.nextLine();
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();
		int kt = 0;
		scanner.nextLine();
		System.out.print("Nhap value can tim");
		String timvalue = scanner.nextLine();
		for (Integer tim : set) {
			if (map.get(tim).equals(timvalue)) {
				kt = 1;
				System.out.print(map.get(tim) + " " + tim);
			}
		}
		if (kt == 0) {
			System.out.print("k co");
		}

	}

}
