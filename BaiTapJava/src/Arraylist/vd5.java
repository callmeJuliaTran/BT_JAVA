package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class vd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình mảng gồm n phần tử, tính tổng phần tử chẵn và phần tử lớn hơn 5
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so luong pt");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(scanner.nextInt());
		}
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0 && list.get(i) > 5) {
				tong = tong + list.get(i);
			}
		}
		System.out.print(tong);
	}

}
