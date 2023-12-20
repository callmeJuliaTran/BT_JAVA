package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

import OOP.tinhtong;

public class ham4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// viết chương trình nhập vào n phần tử, tính tổng các số chẵn, kiểm tra xem
		// tổng số chẵn có lớn hơn 10 k
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			list.add(scanner.nextInt());
		}

		int goiham = tong(list);
		if (goiham > 10) {
			System.out.print("Tong so chan lon hon 10");
		} else if (goiham == 10) {
			System.out.print("Tong so chan bang 10");
		} else {
			System.out.print("Tong so chan be hon 10");
		}
	}

	public static int tong(ArrayList<Integer> list) {
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				tong = tong + list.get(i);
			}
		}
		return tong;
	}

}
