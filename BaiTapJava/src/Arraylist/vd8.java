package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.source.tree.ArrayAccessTree;

public class vd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. Viết chương trình mảng gồm n phần tử, tìm phần tử lớn nhất
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());

		}
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >  max) {
				max = list.get(i);
			}
		}
		System.out.print(max);
	}

}
