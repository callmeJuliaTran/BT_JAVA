package Bai3_BaitapJava;

import java.util.Scanner;

public class ham9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình tính 1/1+1/2+...+1/n

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n ");
		int n = scanner.nextInt();
		
		double goiham = tong(n);
		System.out.print(goiham);
	}

	public static double tong(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + 1/i;
		}
		return sum;

	}

}
