package Baitaptonghop;

import java.net.Socket;

public class b12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo mảng {15, 5, 10, 20, 25} 
//		Tìm kiếm chỉ số của một giá trị 20 xuất hiện trong mảng. 
//		Tìm vị trí lớn nhất và nhỏ nhất

		int arr[] = { 15, 5, 10, 20, 25 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 20) {
				System.out.print(i);
			}
		}

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(" so lon nhat la " + max + " so nho nhat la " + min);
	}

}
