package Baitaptonghop;

import java.util.Scanner;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tính tổng 5 số lẻ đầu tiên, và kiểm tra xem tổng là số lẻ hay là số
		// chẵn

		int tong = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				tong = tong + i;
			}
		}
		System.out.print(tong);

		if (tong % 2 == 0) {
			System.out.print(" tong la so chan");
		} else if (tong % 2 != 0) {
			System.out.print(" tong la so le");

		}
	}

}
