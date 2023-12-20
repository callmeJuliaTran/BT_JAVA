package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ham6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11. Tìm chỉ số của phần tử lẻ đầu tiên(viết hàm)

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu trong mang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(scanner.nextInt());
		}

		int kq = chiso(list);
		System.out.print(kq);
	}

	public static int chiso(ArrayList<Integer> list) {
		int cs = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
                 cs=i;
                 break;
		}
	}return cs;
}
}