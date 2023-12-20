package Mang;

import java.util.Scanner;

public class b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sap xep giam dan
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;

				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
