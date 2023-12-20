package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình nhập key số nguyên value string tìm key có trong map hay k

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
		System.out.print("Nhap key can tim");
		int tim = scanner.nextInt();
		Set<Integer> set = map.keySet();
		int kt = 0;
		for (Integer timkey : set) {
			if (timkey == tim) {
				System.out.print(timkey + " " + map.get(timkey));
				kt = 1;
				break;
			}
		}
		if (kt == 0) {
			System.out.print("Khong tim thay");
		}
	}

}
