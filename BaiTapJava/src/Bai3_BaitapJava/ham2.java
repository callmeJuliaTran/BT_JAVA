package Bai3_BaitapJava;

import java.util.Scanner;

public class ham2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. Tổng các phần tử trong mảng, phải là số nguyên tố hay không( viết hàm)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhap phan tu trong mang");
			arr[i] = scanner.nextInt();
		}

		// cú pháp gọi hàm: kiểu dữ liệu của hàm
		// tên biến = tên hàm(kiểu dữ liệu truyền vào)

		int goiham = songuyento(arr);

		if (goiham == 0) {
			System.out.print("Tong cac phan tu trong mang khong phai la so nguyen to");
		} else if (goiham == 1) {
			System.out.print("Tong cac phan tu trong mang la so nguyen to");

		}
	}

	public static int songuyento(int arr[]) {
		int kt4 = 1;
		int tong4 = 0;
		for (int i = 0; i < arr.length; i++) {
			tong4 = tong4 + arr[i];
		}
		if (tong4 == 2) {
			kt4 = 0;
		} else {
			for (int j = 2; j < tong4; j++) {
				if (tong4 % j == 0) {
					kt4 = 0;
				}
			}
		}
		return kt4;
	}
}
