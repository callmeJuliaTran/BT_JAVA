package Baitaptonghop;

import java.util.Scanner;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình kiểm tra xem số nhập vào là Kiểm tra số dương, số âm hay
		// bằng 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so");
		int n = scanner.nextInt();

		if (n > 0) {
			System.out.print("n la so duong");
		} else if (n < 0) {
			System.out.print("n la so am");
		} else {
			System.out.print("n = 0");
		}

	}

}
