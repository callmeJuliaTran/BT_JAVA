package Arraylist2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tìm kiếm 1 phần tử, kiểm tra xem có phần tử có trong mảng
		// hay k
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());
		}

		System.out.print("Nhap phan tu can tim");
		int pt = scanner.nextInt();
		int goiham = tim(set, pt); // pt va n(o trong ham) phai cung kieu du lieu, hai dua giong nhaooooo
		if (goiham == 1) {
			System.out.print("Phan tu can tim co trong mang");
		} else {
			System.out.print("Phan tu can tim khong co trong mang");
		}
	}

	public static int tim(Set<Integer> set, int n) {
		Scanner scanner = new Scanner(System.in);
		int kt = 0;

		for (Integer i : set) {
			if (n == i) {
				kt = 1;
			}
		}
		return kt;

	}

}
