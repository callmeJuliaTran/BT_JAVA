package Bai3_BaitapJava;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.internal.net.http.common.Demand;

public class ham1 {
//	3.mảng có bao nhiêu số lẻ, tính tổng các số lẻ(viết hàm)
	public static String sole(int arr[]) {
		int dem = 0;
		int tong = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				dem++;
				tong = tong + arr[i];
			}
		}
		return "co " + dem  +" so le va tong la "+ tong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhap phan tu trong mang");
			arr[i] = scanner.nextInt();
		}
		String a = sole(arr);
		System.out.print(a);
	}

}
