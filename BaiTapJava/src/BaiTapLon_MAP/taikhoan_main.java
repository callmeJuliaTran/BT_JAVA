package BaiTapLon_MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthDesktopIconUI;

import com.sun.org.apache.bcel.internal.generic.NEW;

import BaiTapLon_SET.TaiKhoan;

public class taikhoan_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 1. Nhập vào 5 tài khoản.
//		Task2,Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin 
//		đó ra, nếu không trùng báo đăng nhập thất bại
//		Task 3.Đổi mật khẩu
//		Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản
		Scanner scanner = new Scanner(System.in);
		Map<String, TaiKhoan> map = new HashMap<>();
		System.out.print("Nhap vao 3 tai khoan");
		for (int i = 0; i < 3; i++) {
			scanner.nextLine();
			System.out.print("Nhap tai khoan");
			String tk = scanner.nextLine();
			System.out.print("Nhap mat khau");
			String mk = scanner.nextLine();
			map.put(tk, new TaiKhoan(tk, mk));
		}
		System.out.println(
				"Nhap 1 Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin đó ra, nếu không trùng báo đăng nhập thất bại ");
		System.out.println("Nhap 2 Doi mat khau");
		System.out.println("Nhap 3 tim thong tin tai khoan theo ten tai khoan");
		int nhapso = scanner.nextInt();
		if (nhapso == 1) {
			Set<String> set = map.keySet();
			scanner.nextLine();
			int kt = 0;
			System.out.print("Nhap tai khoan");
			String nhaptk = scanner.nextLine();
			for (String i : set) {
				if (map.get(i).getTk().equals(nhaptk)) {
					kt = 1;
					System.out.print("Tai khoan: " + map.get(i).getTk() + " Mat Khau: " + map.get(i).getMk());
					break;
				}

			}
			if (kt == 0) {
				System.out.print("Khong tim thay tai khoan");

			}
		} else if (nhapso == 2) {
			Set<String> set = map.keySet();
			scanner.nextLine();
			int kt = 3;
			System.out.print("Nhap tai khoan");
			String nhaptkString = scanner.nextLine();
			System.out.print("Nhap mat khau");
			String nhapmkString = scanner.nextLine();
			for (String sua : set) {
				if (map.get(sua).getTk().equals(nhaptkString) && !(map.get(sua).getMk().equals(nhapmkString))) {
					kt = 0;
					System.out.print("sai mat khau enter de doi mat khau");
					scanner.nextLine();
					System.out.print("Nhap mk moi");
					String newmk = scanner.nextLine();
					System.out.print("Confirm mk ");
					String confirmmk = scanner.nextLine();
					if (newmk.equals(confirmmk)) {
						map.get(sua).setMk(newmk);
					} else if (!(newmk.equals(confirmmk))) {
						System.out.print("Mat khau k khop");
					}

				} else if (map.get(sua).getTk().equals(nhaptkString) && map.get(sua).getMk().equals(nhapmkString)) {
					kt = 1;
				}

			}
			if (kt == 0) {
				for (String i : set) {
					System.out.println(" TAI KHOAN " + map.get(i).getTk() + " MAT KHAU: " + map.get(i).getMk());
				}
			} else if (kt == 1) {
				System.out.print("Dang nhap thanh cong");
			} else if (kt == 3) {
				System.out.print("Tai khoan khong ton tai");
			}
		} else if (nhapso == 3) {
			Set<String> set = map.keySet();
			scanner.nextLine();
			int kt = 0;
			System.out.print("Nhap tai khoan can tim");
			String nhaptk = scanner.nextLine();
			for (String i : set) {
				if (map.get(i).getTk().equals(nhaptk)) {
					kt = 1;
					System.out.println(" TAI KHOAN: " + map.get(i).getTk() + " MAT KHAU: " + map.get(i).getMk());
					break;
				}
			}
			if (kt == 0) {
				System.out.print("Khong tim thay tai khoan");
			}
		}
	}
}
