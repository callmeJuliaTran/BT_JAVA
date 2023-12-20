package Arraylist2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình xóa 1 phần tử có trong mảng
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());
		}
		int kt = 0;
		System.out.print("Nhap phan tu can xoa");
		int xoa = scanner.nextInt();
		for (Integer i : set) {
			if (i == xoa) {
				kt = 1;
				set.remove(xoa);
				break;    // phải bỏ break vao vi neu trong vong lap forech nếu xóa đi một phần tử thì làm thay đổi giá trị trong mảng =>sai 
			}
		}
		if (kt == 1) {
			for (Integer i : set) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("Phan tu can xoa khong ton tai");
		}
	}

}
