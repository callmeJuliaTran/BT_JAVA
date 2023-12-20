package Ham;

import java.util.Scanner;

public class b11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm phần tử lớn nhất trong mảng, viết hàm

		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i]= sc.nextInt();
		}
		int gh = max(arr);
		System.out.print(gh);
	}

	public static int max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
