package Ham;

import java.util.Scanner;

public class b14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//viết chương trình tính tổng các phần tử lẻ,
		// lớn hơn 4 và bé hơn 10, mảng gồm n phần tử
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			arr[i] = sc.nextInt();
		}
		
		
		int gh = tong(arr); 
		System.out.print(gh);
	}

	public static int tong(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] > 4 && arr[i] < 10) {
				sum = sum + arr[i];
			}
		}
		return sum;

	}

}
