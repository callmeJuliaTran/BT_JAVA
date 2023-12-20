package Mang;
import java.util.Scanner;
public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình tìm phần tử nhỏ nhất
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu");
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(min);
	}

}
