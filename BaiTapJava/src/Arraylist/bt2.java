package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////Viết chương trình xóa 1 phần tử trong mảng

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong pt");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}
		int kt = 0;
		System.out.print("nhap pt muon xoa");
		int m = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == m) {
				kt = 1;
				list.remove(i);
			}
		}
		if (kt == 0) {
			System.out.println("phan tu muon xoa khong co trong mang");
		}
	}

}
