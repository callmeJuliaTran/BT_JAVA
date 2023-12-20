package Arraylist2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tính tổng các số lẻ, mảng gồm n phần tử không trùng lặp

		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());
		}
		int tong = 0;
		for (Integer i : set) {
			if (i % 2 != 0) {
				tong = tong + i;
			}
		}
		System.out.print(tong);
	}

}
