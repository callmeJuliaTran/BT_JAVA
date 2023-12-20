package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////Viết chương trình sửa 1 phần tử trong mảng

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			list.add(scanner.nextInt());
		}
		int kt = 0;
		System.out.print("nhap pt can sua");
		int a = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (a == list.get(i)) {
				kt = 1;
				System.out.print("sua thanh");
				list.set(i, scanner.nextInt());
			}
		}
		if (kt == 1) {
			System.out.println("pt co trong mang");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.print("pt k co trong mang");
		}

	}
}
