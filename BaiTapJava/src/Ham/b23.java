package Ham;

import java.util.Scanner;

public class b23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình hiển thị các số nguyên dương mảng gồm n phần tử
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
	if(arr[i]>0) {
		tong = tong + arr[i];
	}
}
System.out.print(tong);
	}



	}


