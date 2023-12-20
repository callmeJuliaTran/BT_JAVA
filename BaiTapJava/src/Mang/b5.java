package Mang;

import java.util.Scanner;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình mảng gồm n phần tử, in ra các phần từ âm
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i]);
			}
		}
	}

}
