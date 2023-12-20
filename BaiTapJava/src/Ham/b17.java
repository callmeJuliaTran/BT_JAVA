package Ham;

import java.util.Scanner;

public class b17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		Viết chương trình kiểm tra xem phần tử nhập vào có trong mảng hay ko
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		System.out.print("nhap pt can tim");
		int a = sc.nextInt();

		String gh = kiemtra(arr, a);
		System.out.print(gh);
	}

	public static String kiemtra(int[] arr, int a) {

		int kt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				kt = 1;
			}
		}
		if (kt == 1) {
			return "phan tu co trong mang";// return về chuỗi dùng 'string' return ve số dùng 'int'
		} else {
			return "phan tu k co trong mang";
		}
	}

}
