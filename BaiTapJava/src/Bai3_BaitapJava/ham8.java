package Bai3_BaitapJava;

import java.util.Scanner;

public class ham8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình tính tổng 1+2+3+...+n


		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n ");
		int n = scanner.nextInt();
		int goiham = tong(n);
		System.out.print(goiham);
	}

	public static int tong(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}
}
