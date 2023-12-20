package test1;

import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Đếm xem phần tử lớn nhất trong mảng có mấy phần tử
//		4.Kiểm tra xem phần tử có trong mảng hay không
//		5. Tìm chỉ số của phần tử nhỏ nhất
//		6.Tìm phần tử lớn thứ 2 trong mảng, mảng gồm n phần tử

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu co trong mang");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Nhap phan tu can tim");
		int tim = scanner.nextInt();
		int kt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == tim) {
				kt = 1;
			}
		}
		if (kt == 1) {
			System.out.print("Phan tu co trong mang");
		} else if (kt == 0) {
			System.out.print("Phan tu k co trong mang");
		}

	}
}
