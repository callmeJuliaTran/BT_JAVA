package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class vd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Viết chương trình hiển thị các phần tử chẵn, mảng gồm n phần tử

		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(sc.nextInt());
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j) % 2 == 0) {
				System.out.print(list.get(j));
			}
		}
	}

}
