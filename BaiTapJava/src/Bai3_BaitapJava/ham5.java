package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.tree.JCTree.LetExpr;

public class ham5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10. Phần tử thứ 2 và phần tử cuối cùng trong mảng có đối xứng 
//		không(viết hàm)               // 1 3 5 6 3

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu trong mang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap mang");
			list.add(scanner.nextInt());
		}
		int kq = doixung(list);
		if (kq == 1) {
			System.out.print("DOI XUNG");
		} else if (kq == 0) {
			System.out.print("KHONG DOI XUNG");
		}
	}

	public static int doixung(ArrayList<Integer> list) {
		int kt = 1;
		for (int i = 0; i < list.size(); i++) {
			int a = list.get(list.size() - 1);
			if (list.get(1) == a) {
				kt = 1;
			} else {
				kt = 0;
			}
		}
		return kt;

	}

}
