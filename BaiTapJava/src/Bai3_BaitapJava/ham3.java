package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ham3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tính tổng các phần tử trong mảng, mảng gồm n phần tử
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			list.add(scanner.nextInt());
		}

		int ketqua = tong(list);
		System.out.print(ketqua);

	}

	public static int tong(ArrayList<Integer> list) { // ArrayList<Integer> : kieu du lieu list: ten mang
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			tong = tong + list.get(i);
		}
		return tong;
	}

}
