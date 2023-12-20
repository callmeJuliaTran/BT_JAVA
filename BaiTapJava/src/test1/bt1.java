package test1;

import java.util.Scanner;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Nhập n phần tử và in các phần tử ra màng hình

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
