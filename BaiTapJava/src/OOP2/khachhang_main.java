package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.ListDatatypeValidator;
import com.sun.tools.javac.util.List;

import sun.security.x509.DistributionPointName;

public class khachhang_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tạo 1 class quản lý khách hàng gồm các thuộc tính, mã khách hàng, tên, tuổi, quê quán
//		1 Nhập vào n khách hàng và in các khách hàng ra màng hình
//		2.Tìm tuổi khách hàng lớn nhất
//		3.In tt khachhang lonKhachhang tuoi nhat
//		4. Tìm tuổi khách hàng nhỏ nhấ
//		5.đếm xem có bao nhiêu khách hàng lớn hơn 22 tuổi
//		6. Tìm kiếm 1 khách hàng
		Scanner scanner = new Scanner(System.in);
		ArrayList<khachhang> list = new ArrayList<>();
		System.out.print("Nhap so luong khach hang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("nhap ma khach hang");
			String maKH = scanner.nextLine();
			System.out.print("Nhap ten khach hang");
			String tenKH = scanner.nextLine();
			System.out.print("Nhap tuoi khach hang");
			int tuoiKH = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap que khach hang");
			String queKH = scanner.nextLine();
			list.add(new khachhang(maKH, tenKH, tuoiKH, queKH));
		}
		System.out.println("Nhap 1 de in ra cac khach hang");
		System.out.println("Nhap 2 de in ra khach hang lon tuoi nhat");
		System.out.println("Nhap 3 de in ra khach hang nho tuoi nhat");
		System.out.println("Nhap 4 de dem xem co bao nhieu khach hang lon hon 22t");
		System.out.println("Nhap 5 de bat dau tim kiem mot khach hang");

		int m = scanner.nextInt();
		if (m > 0 && m <= 6) {
			if (m == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getMaKH() + " " + list.get(i).getTenKH() + " "
							+ list.get(i).getTuoiKH() + " " + list.get(i).getQueKH());
				}
			} else if (m == 2) {
				int max = list.get(0).getTuoiKH();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTuoiKH() > max) {
						max = list.get(i).getTuoiKH();
					}
					System.out.println("Khach hang tuoi lon nhat la " + max);
				}

			} else if (m == 3) {
				int max = list.get(0).getTuoiKH();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTuoiKH() > max) {
						max = list.get(i).getTuoiKH();
					}
				}
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getTuoiKH() == max) {
						System.out.println(
								"Khach hang lon tuoi nhat la " + list.get(j).getMaKH() + " " + list.get(j).getTenKH()
										+ " " + list.get(j).getTuoiKH() + " " + list.get(j).getQueKH());
					}
				}

			} else if (m == 4) {
				int min = list.get(0).getTuoiKH();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTuoiKH() < min) {
						min = list.get(i).getTuoiKH();
					}
					System.out.print("Khach hang tuoi nho nhat la " + min);
				}
			} else if (m == 5) {
				int dem = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTuoiKH() > 22) {
						dem = dem + 1;
					}
				}
				System.out.print("co " + dem + " khach hang lon hon 22 tuoi");
			} else if (m == 6) {
				scanner.nextLine();
				System.out.print("Nhap ma khach hang can tim");
				String timMaKH = scanner.nextLine();
				int kt = 0;
				for (int i = 0; i < list.size(); i++) {
					if (timMaKH.equals(list.get(i).getMaKH())) {
						kt = 1;
						System.out.println(list.get(i).getMaKH() + " " + list.get(i).getTenKH() + " "
								+ list.get(i).getTuoiKH() + " " + list.get(i).getQueKH());
					}
				}
				if (kt == 0) {
					System.out.print("Khach hang khong ton tai");

				}
		}
		}

	}
}
