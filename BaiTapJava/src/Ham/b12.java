package Ham;

import java.util.Scanner;

public class b12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm khoản cách giữa max và min  (khoản cách = max-min)
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int gh = kc(arr);
		System.out.print(gh);

	}

	public static int kc(int arr[]) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		int khoangcach = max - min;
		return khoangcach;

	}
}
