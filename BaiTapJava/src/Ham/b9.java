package Ham;

import java.util.Scanner;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm chỉ số của phần tử nhỏ nhất, mảng gồm n phần tử

		Scanner sc = new Scanner(System.in);
		System.out.print("so luong phan tu");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i] = sc.nextInt();

		}
		int gh = chiso(arr);
		System.out.print(gh);

	}

	public static int chiso(int[] arr) {
		int min = arr[0];
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				a = i;
			}

		}
		return a;
	}
}
