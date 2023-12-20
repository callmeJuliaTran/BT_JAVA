package BaiTapLon_SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaiKhoan_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Quản lý hệ thống, để quản lý hệ thống cần 1 class gồm tên tài khoản, Mật khẩu
//		Task 1. Nhập vào 5 tài khoản.
//		Task2,Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin 
//		đó ra, nếu không trùng báo đăng nhập thất bại
//		Task 3.Đổi mật khẩu
//		Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản
		Scanner scanner = new Scanner(System.in);
		Set<TaiKhoan> set = new HashSet<TaiKhoan>();
		System.out.print("Nhap vao 5 tai khoan");
		for (int i = 0; i < 5; i++) {
			scanner.nextLine();
			System.out.print("Nhap tai khoan");
			String tk = scanner.nextLine();
			System.out.print("Nhap mat khau");
			String mk = scanner.nextLine();
			set.add(new TaiKhoan(tk, mk));
		}
		System.out.println(
				"Nhap 1 Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin đó ra, nếu không trùng báo đăng nhập thất bại ");
		System.out.println("Nhap 2 Doi mat khau");
		System.out.println("Nhap 3 tim thong tin tai khoan theo ten tai khoan");
		int nhapso = scanner.nextInt();
		if (nhapso == 1) {
			int kt = 0;
			scanner.nextLine();
			System.out.print("Moi nhap tai khoan");
			String nhaptk = scanner.nextLine();
			System.out.print("Moi nhap mat khau");
			String nhapmk = scanner.nextLine();
			for (TaiKhoan dangnhap : set) {
				if (nhaptk.equals(dangnhap.getTk()) && nhapmk.equals(dangnhap.getMk())) {
					kt = 1;
				}
			}
			if (kt == 1) {
				System.out.print("Dang nhap thanh cong");
			} else {
				System.out.print("Tai khoan hoac mat khau khong dung");
			}
		} else if (nhapso == 2) {
			int kt = -1;
			scanner.nextLine();
			System.out.print("Moi nhap tai khoan");
			String nhaptk = scanner.nextLine();
			System.out.print("Moi nhap mat khau");
			String nhapmk = scanner.nextLine();
			for (TaiKhoan dangnhap : set) {
				if (nhaptk.equals(dangnhap.getTk()) && nhapmk.equals(dangnhap.getMk())) {
					kt = 1;
				} else if (nhaptk.equals(dangnhap.getTk()) && !(nhapmk.equals(dangnhap.getMk()))) {
					kt = 2;
					System.out.print("Mat khau bi sai. Ban quen mat khau? enter doi mat khau");
					scanner.nextLine();
					System.out.print("Doi mat khau thanh");
					String newmk = scanner.nextLine();
					for (TaiKhoan doimk : set) {
						if (doimk.getTk().equals(nhaptk)) {
							doimk.setMk(newmk);
							break;         // chỉ đôir sang array khi cần đổi cả cụm object nếu chỉ đổi 1 phần tử thì không cần chỉ số 
						}
					}
				}
			}
			if (kt == 1) {
				System.out.print("Dang nhap thanh cong");
			} else if (kt == 2) {
				System.out.print("Mat khau doi thanh cong");
				for (TaiKhoan i : set) {
					System.out.println(i.getTk() + " " + i.getMk());
				}
			} else {
				System.out.print("ten dang nhap khong dung");

			}
		}else if(nhapso==3) {
			int kt=0;
			scanner.nextLine();
			System.out.print("Nhap ten tk can tim");
			String timtk = scanner.nextLine();
			for(TaiKhoan tim: set) {
				if(timtk.equals(tim.getTk())) {
					kt=1;
					System.out.print(tim.getTk()+" "+ tim.getMk());
					break;
				}
			}
			
			if(kt==0) {
				System.out.print("Khong tim thay tk can tim");
			}
		}
	}
}
