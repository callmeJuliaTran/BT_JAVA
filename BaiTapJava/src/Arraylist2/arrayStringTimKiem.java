package Arraylist2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class arrayStringTimKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo 1 mảng gồm n phần tử gồm các phân tử điều là string, cac phan tu khong trung lap dung set
//		Viết chương trình sửa,xóa,tìm kiếm 1 phần tử String\
//		Set<Integer> set = new HashSet<>(); đây là kiểu Integer
//		Set<String> set = new HashSet<>(); đây là kiểu String

		Scanner scanner = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu trong mang");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap phan tu mang");
		for (int i = 0; i < n; i++) {
			set.add(scanner.nextLine());
		}
		System.out.print(set);

		int kt = 0;
		scanner.nextLine();
		System.out.print("Nhap phan tu can tim");
		String tim = scanner.nextLine();
		for (String timkiem : set) {
			if (tim.equals(timkiem)) {
				kt = 1;
				break;
			}
		}

		if (kt == 1) {
			System.out.print("Phan tu co trong mang");
		} else {
			System.out.print("Phan tu can tim khong ton tai");
		}
	}

}
