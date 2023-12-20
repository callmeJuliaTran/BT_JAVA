package Ham;

import java.util.Scanner;

public class b22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tính mảng gồm n phần tử, tính tổng các số nguyên âm
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			arr[i] = sc.nextInt();
	}
		int tong = 0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]<0) {
		tong = tong + arr[i];
	}
}
System.out.print(tong);
	}
}

