package Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class arrayStringXoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo 1 mảng gồm n phần tử gồm các phân tử điều là string, cac phan tu khong trung lap dung set
//		Viết chương trình sửa,xóa,tìm kiếm 1 phần tử String\
//		Set<Integer> set = new HashSet<>(); đây là kiểu Integer
//		Set<String> set = new HashSet<>(); đây là kiểu String

		Scanner scanner = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu cho mang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap mang ");
			set.add(scanner.nextLine());
		}
		System.out.print(set);
//		scanner.nextLine();
//		System.out.print("Nhap phan tu muon xoa");
//		set.remove(scanner.nextLine());
//		System.out.print(set);

		scanner.nextLine();
		System.out.print("Tim phan tu muon xoa");
		int kt = 1;
		String ptxoa = scanner.nextLine();
		for (String xoa : set) {
			if (ptxoa.equals(xoa)) {
				set.remove(xoa);
				kt = 1;
				break;
			}
		}

		if (kt == 1) {
			System.out.print(set);
		} else {
			System.out.print("Phan tu can tim khong ton tai");
		}

	}

}
