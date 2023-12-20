package Mang;

import java.util.Scanner;

public class b4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm số lớn nhất trong mảng
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);
		
	}

}
