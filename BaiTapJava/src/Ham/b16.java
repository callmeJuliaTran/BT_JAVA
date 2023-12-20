package Ham;

import java.util.Scanner;

public class b16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Viết chương trình tính tổng các phần tử lớn hơn 5, mảng gồm n phần tử
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int gh = sum(arr);
		System.out.print(gh);
	}

	public static int sum(int[] arr) {
		int tong = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>5) {
		tong = tong + arr[i];
			}
		}
		return tong;
	}

	}


