package Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nhanvien_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 1 .Gỉa sử có n nhân viên gồm tên tuổi,mã nhân viên,
		// lương,
		// in ra n nhân viên đó
		// 1 tìm tên nhân viên, và in thông tin nhân
//		viên đó ra màng hình
//		Task 2.xóa 1 nhân viên có trong mảng
//		Task 3.Tìm tuổi của nhân viên lớn nhất
		// Task 4.Hiểm thị các nhân viên có tiền lương lớn thứ 2

		Scanner scanner = new Scanner(System.in);
		Set<Nhanvien> list = new HashSet();
		System.out.print("Nhap so luong nhan vien");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten");
			String ten = scanner.nextLine();
			System.out.print("Nhap tuoi");
			int tuoi = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma nhan vien");
			String ma = scanner.nextLine();
			System.out.print("Nhap luong nhan vien");
			int luong = scanner.nextInt();
			list.add(new Nhanvien(ten, tuoi, ma, luong)); // list la ten mang
		}
		for (Nhanvien iNhanvien : list) {
			System.out.print(iNhanvien.getTen() + " " + iNhanvien.getMa() + " " + iNhanvien.getTuoi() + " "
					+ iNhanvien.getLuong());
		}

		System.out.print("Nhap 1 de tim nv.");
		System.out.print("Nhap 2 de xoa nv");
		System.out.print("Nhap 3 de tim nv tuoi lon nhat");
		int nhapso = scanner.nextInt();
		if (nhapso == 1) {
			scanner.nextLine();
			System.out.print("Nhap ma nhan vien can tim");
			String timma = scanner.nextLine();
			for (Nhanvien tim : list) { // list la ten mang. Nhanvien la kieu du lieu. tim la ten bien chua object
				if (tim.getMa().equals(timma)) {
					System.out.print(tim.getTen() + " " + tim.getMa() + " " + tim.getTuoi() + " " + tim.getLuong());
				}
			}
		} else if (nhapso == 2) {
			int kt = 0;
			scanner.nextLine();
			System.out.print("Nhap ten nv muon xoa");
			String xoa = scanner.nextLine();
			for (Nhanvien xoa1 : list) {
				if (xoa1.getTen().equals(xoa)) {
					list.remove(xoa1);
					kt = 1;
					break;
				}
			}
			if (kt == 1) {
				for (Nhanvien i : list) {
					System.out.print(i.getTen() + " " + i.getMa() + " " + i.getTuoi() + " " + i.getLuong());
				}
			} else {
				System.out.print("Nhan vien can xoa khong ton tai");
			}
		} else if (nhapso == 3) {
			// Task 3.Tìm tuổi của nhân viên lớn nhất
			int max = 0;
			for (Nhanvien i : list) {
				if (i.getTuoi() > max) {
					max = i.getTuoi();
				}
			}

			for (Nhanvien j : list) {
				if (j.getTuoi() == max) {
					System.out.print(j.getTuoi() + " " + j.getTen() + " " + j.getMa() + " " + j.getLuong());
				}
			}
		} else if (nhapso == 4) {
//			Task 4.Hiểm thị các nhân viên có tiền lương lớn thứ 2
			ArrayList<Nhanvien> arrayList = new ArrayList<>(); // KIEU DU LIEU
			arrayList.addAll(list); // tenlist.addAll(ten set)
			for (int i = 0; i < arrayList.size(); i++) { // lien quan den chi so dung for binh thuong
				for (int j = i + 1; j < arrayList.size(); j++) {
					if (arrayList.get(j).getLuong() > arrayList.get(i).getLuong()) {
						Nhanvien tNhanvien = arrayList.get(i);
						arrayList.set(i, arrayList.get(j));
						arrayList.set(j, tNhanvien); // j la chi so cai cho thay vao
					}
				}
			}
			System.out.print(arrayList.get(1).getTen() + " " + arrayList.get(1).getTuoi() + " "
					+ arrayList.get(1).getMa() + " " + arrayList.get(1).getLuong());

		} else if (nhapso == 5) {
			// Sắp xếp tăng dần tuổi của nhân viên
			ArrayList<Nhanvien> arrlist = new ArrayList<>();
			arrlist.addAll(list);
			for (int i = 0; i < arrlist.size(); i++) {
				for (int j = i + 1; j < arrlist.size(); j++) { // 5 3 6
					if (arrlist.get(j).getTuoi() < arrlist.get(i).getTuoi()) {
						Nhanvien tNhanvien = arrlist.get(i);
						arrlist.set(i, arrlist.get(j));
						arrlist.set(j, tNhanvien);
						
					}
				}
			}
			for(int i =0;i<arrlist.size();i++) {
				System.out.print(arrlist.get(i).getTen() + " " + arrlist.get(i).getTuoi() + " "
						+ arrlist.get(i).getMa() + " " + arrlist.get(i).getLuong());
			}
		}

	}
}
