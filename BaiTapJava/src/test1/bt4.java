package test1;

import java.net.Socket;
import java.util.Scanner;

import Test_OOP.ChitietTK;

public class bt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//5. Tìm chỉ số của phần tử nhỏ nhất

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong pt trong mang");
		int n=scanner.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int min =arr[0];
		int j=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				j=i;
			}
		}System.out.print("vt cua phan tu la "+ j);

}
}
