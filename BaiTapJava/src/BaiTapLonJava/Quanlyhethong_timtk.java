package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlyhethong_timtk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản
		Scanner scanner = new Scanner(System.in);
		ArrayList<Quanlyhethong> list = new ArrayList<>();
		System.out.print("Nhap vao 5 tai khoan");
		int n = 5;
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten tk");
			String tentk = scanner.nextLine();
			System.out.print("Nhap mk ");
			String mk = scanner.nextLine();
			list.add(new Quanlyhethong(tentk, mk));
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap tk");
		String taikhoan = sc.nextLine();
		boolean goiham = find(list, taikhoan);
		if (goiham == true) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTentk().equals(taikhoan)) {
					System.out.print(list.get(i).getTentk() + " " + list.get(i).getMk());
				}
			}
		} else if (goiham == false) {
			System.out.print("tai khoan khong tim thay");
		}
	}

	public static boolean find(ArrayList<Quanlyhethong> list, String taikhoan) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTentk().equals(taikhoan)) {
				return true;
			}

		}
		return false;
	}

}
