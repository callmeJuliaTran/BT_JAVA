package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình nhâp key số nguyên value là string xóa 1 giá trị theo key

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
		int kt = 0;
		Set<Integer> set = map.keySet(); // luu gtri key
		System.out.print("Nhap key muon xoa");
		int keyxoa = scanner.nextInt();
		for (Integer xoa : set) {
			if (xoa == keyxoa) {
				map.remove(xoa);
				kt = 1;
				break;
			}
		}
		if (kt == 1) {
			for (Integer a : set) {
				System.out.print(map.get(a));
			}
		} else if (kt == 0) {
			System.out.print("k tim dc");
		}
	}

}
