package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class taikhoan_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo 1 class Tài Khoản gồm các thuộc tính:
//		Số tài khoản:int
//		Họ Tên:String
//		Số Tiền: double
//		Mật khẩu:String
//		Câu hỏi:
//		1 nhập n tài khoản, in ra các tài khoản
//		2 sửa thông tin của 1 tài khoản
//		3. xóa thông tin của 1 tài khoản
//		4. tìm số tiền lớn nhất, và in ra tài khoản đó làn tài khoản nào

		Scanner scanner = new Scanner(System.in);
		ArrayList<taikhoan> list = new ArrayList<>();
		System.out.print("Nhap so luong tai khoan");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so tai khoan");
			int stk = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ho va ten chu tai khoan");
			String hoten = scanner.nextLine();
			System.out.print("Nhap so tien");
			double sotien = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Nhap mat khau");
			String mk = scanner.nextLine();
			list.add(new taikhoan(stk, hoten, sotien, mk));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getStk() + " " + list.get(i).getHoten() + " " + list.get(i).getSotien()
					+ " VND " + " " + list.get(i).getMk());
		}
		scanner.nextLine();
		System.out.print("Nhap stk muon sua");
		int suastk = scanner.nextInt();
		int kt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStk() == suastk) {
				kt = 1;
				System.out.println("sua thong tin, thong tin khong can sua co the giu nguyen ");
				scanner.nextLine();
				System.out.println("sua ho ten");
				String suahoten = scanner.nextLine();
				list.get(i).setHoten(suahoten);
				System.out.print("sua so tien");
				double suasotien = scanner.nextDouble();
				list.get(i).setSotien(suasotien);
				scanner.nextLine();
				System.out.print("sua mat khau");
				String suamk = scanner.nextLine();
				list.get(i).setMk(suamk);
			}
		}
		if (kt == 0) {
			System.out.println("So tai khoan khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Tai khoan sau khi sua thanh " + list.get(i).getStk() + " " + list.get(i).getHoten()
						+ " " + list.get(i).getSotien() + " " + list.get(i).getMk());
			}
		}

		scanner.nextLine();
		System.out.println("Nhap so tai khoan muon xoa ");
		int xoa = scanner.nextInt();
		int kt1 = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStk() == xoa) {
				kt1 = 1;
				list.remove(i);
			}
		}
		if (kt == 0) {
			System.out.println("Phan tu muon xoa khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getStk() + " " + list.get(i).getHoten() + " " + list.get(i).getSotien()
						+ " " + list.get(i).getMk());
			}
		}

		double max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSotien() > max) {
				max = list.get(i).getSotien();
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getSotien() == max) {
				System.out.println("Tai khoan co so tien lon nhat la " + list.get(j).getStk() + " "
						+ list.get(j).getHoten() + " " + list.get(j).getSotien() + " " + list.get(j).getMk());
			}
		}

	}
}
