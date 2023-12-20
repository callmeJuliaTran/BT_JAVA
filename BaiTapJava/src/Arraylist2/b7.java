package Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.sun.tools.javac.util.List;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình mảng gồm các phần tử k trùng lặp, sửa 1 phần tử
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());

		}
		list.addAll(set); // chuyển các phần tử trong set về array list
		System.out.print("Nhap phan tu muon sua");
		int pt = scanner.nextInt();
		int kt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (pt == list.get(i)) {
				System.out.print("Sua thanh");
				list.set(i, scanner.nextInt());
				kt = 1;
			}
		}
		if (kt == 1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		} else {
			System.out.print("Phan tu can tim khong ton tai");
		}
	}

}
