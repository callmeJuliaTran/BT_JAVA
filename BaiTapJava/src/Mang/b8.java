package Mang;

import java.util.Scanner;

public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình kiểm tra xem phần tử có trong mảng hay k
		

		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		int kt=0;
		for(int i =0;i<arr.length;i++) {
			if(a==arr[i]) {
				kt = 1;
				break;
			}
		}
		if(kt==1) {
			System.out.print("pt co trong mang");
		}else {
			System.out.print("pt k co trong mang");
		}
	}

}
