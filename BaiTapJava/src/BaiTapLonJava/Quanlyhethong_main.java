package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

import sun.security.jgss.LoginConfigImpl;

public class Quanlyhethong_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Quản lý hệ thống, để quản lý hệ thống cần 1 class gồm tên tài khoản, Mật khẩu
//		Task 1. Nhập vào 5 tài khoản.
//		Task2,Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin 
//		đó ra, nếu không trùng báo đăng nhập thất bại
//		Task 3.Đổi mật khẩu
//		Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản

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

		boolean goiham = login(list);
		if (goiham == true) {
			System.out.print("Dang nhap thanh cong");
		} else if (goiham == false) {
			System.out.print("tai khoan hoac mat khau k dung");
		}
	}

	public static boolean login(ArrayList<Quanlyhethong> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap tk");
		String taikhoan = sc.nextLine();
		System.out.print("Moi nhap mk");
		String matkhau = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTentk().equals(taikhoan) && list.get(i).getMk().equals(matkhau)) {
				return true;
			}

		}
		return false;
	}

}
