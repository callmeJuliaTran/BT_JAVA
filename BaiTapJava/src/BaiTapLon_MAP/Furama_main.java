package BaiTapLon_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import BaiTapLon_SET.Furama;
import Map.sinhvien;

public class Furama_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Map<String, Furama> map = new HashMap<>();
		System.out.print("Nhap so luong nhan vien");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten nv");
			String ten = scanner.nextLine();
			System.out.print("Nhap tuoi nv");
			int tuoi = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma nv");
			String ma = scanner.nextLine();
			System.out.print("Nhap luong nv");
			int luong = scanner.nextInt();
			map.put(ma, new Furama(ten, tuoi, ma, luong));
		}

		System.out.println("Nhap 1 in thông tin nhân viên đó ra màng hình");
		System.out.println("Nhap 2 Sắp xếp giảm dần tuổi của nhân viên");
		System.out.println("Nhap 3 Tìm tuổi của nhân viên lớn nhất");
		System.out.println("Nhap 4 Thêm 1 nhân viên vào vị trí bất kì");
		System.out.println("Nhap 5 Xóa nhân viên theo mã nhân viên");
		System.out.println("Nhap 6 Hiểm thị các nhân viên có tiền lương lớn thứ 2");
		int nhapso = scanner.nextInt();

		if (nhapso == 1) {
			Set<String> set = map.keySet();
			for (String so1 : set) {
				System.out.print("Ma: " + map.get(so1).getMa() + " Ten: " + map.get(so1).getTen() + " Tuoi: "
						+ map.get(so1).getTuoi() + " Luong: " + map.get(so1).getLuong());
			}
		} else if (nhapso == 2) {
			Set<String> set = map.keySet();
			ArrayList<Furama> list = new ArrayList<>();
			for (String giamdan : set) {
				list.add(map.get(giamdan));
			}
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) { // 5 6
					if (list.get(j).getTuoi() > list.get(i).getTuoi()) {
						Furama t = list.get(i);
						list.set(i, list.get(j));
						list.set(j, t);
					}
				}
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTen() + " " + list.get(i).getTuoi() + " " + list.get(i).getMa() + " "
						+ list.get(i).getLuong());
			}
		} else if (nhapso == 3) {
			Set<String> set = map.keySet();
			int max = 0;
			for (String find : set) {
				if (map.get(find).getTuoi() > max) {
					max = map.get(find).getTuoi();
				}
			}
			for (String find : set) {
				if (map.get(find).getTuoi() == max) {
					System.out.print(map.get(find).getTen() + " " + map.get(find).getTuoi() + " "
							+ map.get(find).getMa() + " " + map.get(find).getLuong());
				}
			}
		} else if (nhapso == 4) {
			int kt4 = 0;
			ArrayList<Furama> list = new ArrayList<>();
			Set<String> set = map.keySet();
			for (String them : set) {
				list.add(map.get(them));
			}
			System.out.print("Nhap vi tri nhan vien can them");
			int vt = scanner.nextInt();

			for (int i = 0; i < list.size(); i++) {
				if (i == vt) {
					System.out.println("Nhap nhan vien can them");
					scanner.nextLine();
					System.out.print("Nhap ten nv");
					String newten = scanner.nextLine();
					System.out.print("Nhap tuoi nv");
					int newtuoi = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhap ma nv");
					String newma = scanner.nextLine();
					System.out.print("Nhap luong nv");
					int newluong = scanner.nextInt();
					// map.put(newma, new Furama(newten, newtuoi, newma, newluong)); // them vi tri
					// sau cung
					list.add(vt, new Furama(newten, newtuoi, newma, newluong)); // them vi tri PHAI THEM VT
				}

			}
			if (vt == list.size()) {
				System.out.println("Nhap nhan vien can them");
				scanner.nextLine();
				System.out.print("Nhap ten nv");
				String newten = scanner.nextLine();
				System.out.print("Nhap tuoi nv");
				int newtuoi = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Nhap ma nv");
				String newma = scanner.nextLine();
				System.out.print("Nhap luong nv");
				int newluong = scanner.nextInt();
				list.add(vt, new Furama(newten, newtuoi, newma, newluong));
			}
//			for (String add1 : set) {
//				System.out.println(map.get(add1).getTen() + " " + map.get(add1).getTuoi() + " " + map.get(add1).getMa()
//						+ " " + map.get(add1).getLuong());
//			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTen() + " " + list.get(i).getTuoi() + " " + list.get(i).getLuong() + " "
						+ list.get(i).getMa());
			}

		} else if (nhapso == 5) {
			Set<String> set = map.keySet();
			int kt = 0;
			scanner.nextLine();
			System.out.print("Nhap ma nhan vien can xoa");
			String xoa = scanner.nextLine();
			for (String delete : set) {
				if (map.get(delete).getMa().equals(xoa)) {
					kt = 1;
					map.remove(xoa);
				}
			}
			for (String afterdel : set) {
				System.out.println(map.get(afterdel).getTen() + " " + map.get(afterdel).getTuoi() + " "
						+ map.get(afterdel).getMa() + " " + map.get(afterdel).getLuong());
			}

		} else if (nhapso == 6) {
			// Nhap 6 Hiểm thị các nhân viên có tiền lương lớn thứ 2
			Set<String> set = map.keySet();
			ArrayList<Furama> list = new ArrayList<>();
			for(String iString : set) {
				list.add(map.get(iString));
			}
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getLuong() < list.get(j).getLuong()) {
						Furama tempFurama = list.get(i);
						list.set(i, list.get(j));
						list.set(j, tempFurama);
					}
				}
			}

			System.out.print(list.get(1).getTen() + " " + list.get(1).getLuong() + " " + list.get(1).getTuoi() + " "
					+ list.get(1).getMa());  // KHong de trong vong lap for trong vong lap for in ra het

		}

	}
}
