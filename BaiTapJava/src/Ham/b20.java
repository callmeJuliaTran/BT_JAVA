package Ham;

import java.util.Scanner;

public class b20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình kiểm tra xem mảng có đối xứng hay k
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int kt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1]) {
				kt = 0;
			}
		}

		if (kt == 1) {
			System.out.print("mang doi xung");
		} else if (kt == 0) {
			System.out.print("mang k doi xung");
		}

	}

}
