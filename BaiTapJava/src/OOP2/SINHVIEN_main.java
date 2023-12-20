package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.ListDatatypeValidator;
import com.sun.tools.javac.util.List;

public class SINHVIEN_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình quản lý sinh viên, gồm mã sinh viên tên, tuổi, mã lớp,điểm trung bình
//		1.Nhập n sinh viên và in ra màng hình 
//		2. Hiển thị các sinh viên lớn hơn 20 và bé hơn 25
//		3.Hiển thị sinh viên có điểm trung bình cao nhất
//		4, Hiển thị các sinh viên có điểm =8
		ArrayList<SINHVIEN> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma sinh vien");
			String maSV = scanner.nextLine();
			scanner.nextLine();
			System.out.print("Nhap ten sinh vien");
			String tenSV = scanner.nextLine();
			System.out.print("Nhap tuoi sinh vien");
			int tuoiSV = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma lop sinh vien");
			String lopSV = scanner.nextLine();
			System.out.print("Nhap diem trung binh");
			double dtbSV = scanner.nextDouble();
			list.add(new SINHVIEN(maSV, tuoiSV, lopSV, dtbSV, tenSV));
		}
		System.out.println("Nhap 1 de in ra sinh vien");
		System.out.println("Nhap 2 de in ra a sinh vien lon hon 20t va be hon 25t");
		System.out.println("Nhap 3 de hien thi sinh vien co dtb cao nhat");
		System.out.println("Nhap 4 de hien thi sinh vien co diem =8");

		int a = scanner.nextInt();
		if (a > 0 && a < 5) {
			if (a == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getMaSV() + " " + list.get(i).getTenSV() + " "
							+ list.get(i).getTuoiSV() + " " + list.get(i).getLopSV() + " " + list.get(i).getDtbSV());
				}
			} else if (a == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTuoiSV() > 20 && list.get(i).getTuoiSV() < 25) {
						System.out.println("Ma sinh vien " + list.get(i).getMaSV());
						System.out.println("Ten sinh vien " + list.get(i).getTenSV());
						System.out.println("Tuoi sinh vien " + list.get(i).getTuoiSV());
						System.out.println("Ma lop sinh vien " + list.get(i).getLopSV());
						System.out.print("Diem trung binh sinh vien " + list.get(i).getDtbSV());
					}
				}
			} else if (a == 3) {
				double max = list.get(0).getDtbSV();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getDtbSV() > max) {
						max = list.get(i).getDtbSV();
					}
				}
				for (int j = 0; j > list.size(); j++) {
					if (list.get(j).getTuoiSV() == max) {
						System.out.println("Sinh vien có dtb cao nhat la " + list.get(j).getTenSV() + " "
								+ list.get(j).getMaSV() + " " + list.get(j).getLopSV() + " " + list.get(j).getDtbSV());
					}
				}
			} else if (a == 4) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getDtbSV() > 8) {
						System.out.println("Cac sinh vien co diem trung binh = 8 la " + list.get(i).getMaSV() + " "
								+ list.get(i).getTenSV() + " " + list.get(i).getTuoiSV() + " " + list.get(i).getLopSV()
								+ " " + list.get(i).getDtbSV());
					}
				}
			}

		}

	}

}
