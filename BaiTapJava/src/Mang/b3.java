package Mang;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Viết chương trình tính tổng các phần tử số lẻ có trong mảng,

		int tong = 0;
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				tong = tong + arr[i];
			}
		}
		System.out.print(tong);
	}

}
