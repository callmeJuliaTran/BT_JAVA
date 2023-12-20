package Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình nhập n phần tử, nhập vào loại bỏ các phần tử trùng lặp
		// in ra phần tử đó

		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());
		}
		for (Integer i : set) {
			System.out.print(i);
		}
	}
}
