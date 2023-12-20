package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.code.Type.ForAll;

public class vd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2 Viết chương trình mảng gồm n phần tử, hiển thị các số chẵn

		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu");
			list.add(scanner.nextInt());
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

}
