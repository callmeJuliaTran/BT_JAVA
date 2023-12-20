package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class vd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tìm phần tử lớn nhất, mảng gồm n phần tử
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(sc.nextInt());
		}
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)>max ) {
				 max = list.get(i) ;
			}
		}
		System.out.print(max);

	}

}
