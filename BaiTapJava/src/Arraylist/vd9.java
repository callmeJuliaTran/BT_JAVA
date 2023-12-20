package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class vd9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình mảng gồm n phần tử, tính tổng các phần tử lẻ vị trí lẻ

		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0 && i % 2 != 0) {
				tong = tong + list.get(i);
			}
		}
		System.out.print(tong);
	}

}
