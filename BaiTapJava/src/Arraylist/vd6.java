package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.code.Type.ForAll;

public class vd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Viết chương trình trình kiểm tra xem phần tử cần tìm có trong mảng hay k
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			list.add(scanner.nextInt());
		}

		int kt = 0;
		System.out.print("nhap phan tu can tim");
		int j = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == j) {
				kt = 1;
				break;
			}
		}
		if (kt == 1) {
			System.out.print("phan tu co trong mang");
		} else {
			System.out.print("phan tu khong co trong mang");
		}

		
		
	}

}
