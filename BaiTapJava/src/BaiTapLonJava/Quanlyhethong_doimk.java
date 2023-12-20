package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlyhethong_doimk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		scanner.nextLine();
		System.out.print("Moi nhap tk");
		String taikhoan = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Moi nhap mk");
		String matkhau = scanner.nextLine();
		int goiham = doimk(list, taikhoan, matkhau);
		if (goiham == 1) {
			System.out.print("Moi nhap mat khau moi");
			String newmk = scanner.nextLine();
			System.out.print("Moi xac nhan mat khau moi");
			String newmk1 = scanner.nextLine();
			if (newmk.equals(newmk1)) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTentk().equals(taikhoan)) {
						list.get(i).setMk(newmk);
					}
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).tentk + " " + list.get(i).mk);
				}
			} else {
				System.out.print("Mat khau xac nhan khong trung khop");
			}
		} else {
			System.out.print("TK hoac MK k hop le");
		}
	}

	public static int doimk(ArrayList<Quanlyhethong> list, String taikhoan, String matkhau) {
		int kt = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTentk().equals(taikhoan) && list.get(i).getMk().equals(matkhau)) {
				kt = 1;
			}

		}
		return kt;
	}
}
