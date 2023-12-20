package Baitaptonghop;

import java.util.ArrayList;
import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Làm thế nào để tìm phần tử lớn nhất và nhỏ nhất trong mảng, mảng gồm n phần 
		// tử
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong pt");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.print("min la " + min + " & max la " + max);
	}

}
