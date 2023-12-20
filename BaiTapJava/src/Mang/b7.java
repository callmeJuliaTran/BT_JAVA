package Mang;

import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm chỉ số của phần tử lớn nhất
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int chiso = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				chiso = i;
			}
			
		}System.out.print(chiso);
	}
}

	

	
