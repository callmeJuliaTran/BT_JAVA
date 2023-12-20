package Ham;

import java.util.Scanner;

public class b18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình sửa 1 phần tử có trong mảng
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu trong mang");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i] = sc.nextInt();
		}
		System.out.print("Nhap phan tu muon sửa");
		int a = sc.nextInt();
		int kt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				kt = 1;
				System.out.print("Sua thanh");
				int b = sc.nextInt();
				a = b;
				arr[i] = b;
			}
		}
		if (kt == 0) {
			System.out.print("phan tu k co trong mang ");
		} else if (kt == 1) {
			System.out.print("phan tu sau khi sua thanh ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
