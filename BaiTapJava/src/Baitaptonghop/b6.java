package Baitaptonghop;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Làm thế nào để tính tổng các phần tử trong mảng, mảng gồm n phần tử
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong pt");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			tong = tong + list.get(i);
		}
		System.out.print(tong);
	}

}
