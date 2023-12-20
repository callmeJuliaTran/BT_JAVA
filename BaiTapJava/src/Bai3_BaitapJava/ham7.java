package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ham7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// kiểm tra xem các phần tử trong mảng là các số lẻ hay chẵn(viết hàm)

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu trong mang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(scanner.nextInt());
		}
		
		int goiham = sochan(list);
		if (goiham % 2 == 0) {
			 System.out.print("So chan");
		 }else {
			 System.out.print("So le");
		 }
	}

	public static int sochan(ArrayList<Integer> list) {
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			tong = tong + list.get(i);
		}
		return tong;
	}
	
	

}
