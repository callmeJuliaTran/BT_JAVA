package Bai3_BaitapJava;

import java.util.Scanner;

public class ham10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình tính giai thừa của 1 số ví dụ 3!=1*2*3
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n ");
		int n = scanner.nextInt();
		int goiham = giaithua(n);
		System.out.print(goiham);
	}

	public static int giaithua(int n) {
		int kq = 1;
		for (int i = 1; i <= n; i++) {
			kq = kq * i;
		}
		return kq;
	}

}
