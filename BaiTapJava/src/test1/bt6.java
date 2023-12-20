package test1;

import java.util.Scanner;

public class bt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đếm xem phần tử lớn nhất trong mảng có mấy phần tu
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int dem = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == max) {
				dem = dem + 1;
			}
		}
		System.out.print(dem);
	}

}
