package Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class arrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo 1 mảng gồm n phần tử gồm các phân tử điều là string, cac phan tu khong trung lap dung set
//		Viết chương trình sửa,xóa,tìm kiếm 1 phần tử String\
//		Set<Integer> set = new HashSet<>(); đây là kiểu Integer
//		Set<String> set = new HashSet<>(); đây là kiểu String

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>(); // tao mang
		Set<String> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu trong mang String");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap phan tu String");
			set.add(scanner.nextLine());
		}
		System.out.print(set);
		list.addAll(set); // chuyển các phần tử trong set về array list
		scanner.nextLine();
		int kt = 1;
		System.out.print("Nhap phan tu muon sua");
		String sua = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (sua.equals(list.get(i))) {
				scanner.nextLine();
				System.out.print("Sua thanh");
				list.set(i, scanner.nextLine());
				kt = 1;
			}

		}

		if (kt == 1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
		} else {
			System.out.print("Phan tu can tim k ton tai");
		}
	}
}
