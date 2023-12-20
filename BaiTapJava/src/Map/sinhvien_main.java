package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import jdk.internal.foreign.abi.aarch64.macos.MacOsAArch64CallArranger;

public class sinhvien_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tạo 1 class sinh viên gồm mã sinh viên, tên,tuổi,điểm trung bình
		// mã sinh viên k được trùng lặp
		// nhập n sinh viên và in ra sinh viên có trong map
//		tìm kiếm 1 sinh viên dựa vào mã sinh viên
//		tìm kiếm tuổi lớn nhất của sinh viên
	//	sửa tên của sinh viên dựa vào key của sinh viên

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien");
		int n = scanner.nextInt();
		Map<String, sinhvien> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma sinh vien");
			String msv = scanner.nextLine();
			System.out.print("Nhap  ten sinh vien");
			String ten = scanner.nextLine();
			System.out.print("Nhap tuoi sinh vien");
			int tuoi = scanner.nextInt();
			System.out.print("Nhap diem trung binh");
			int dtb = scanner.nextInt();
			map.put(msv, new sinhvien(msv, ten, tuoi, dtb));
		}
		System.out.println("Nhập 1 để in ra sinh viên");
		System.out.println("Nhap 2 de tim sinh vien dua vao ma sinh vien");
		System.out.println("Nhap 3 de tim sv tuoi lon nhat");
		System.out.println("Nhap 4 sửa tên của sinh viên dựa vào key của sinh viên");
		int nhapso = scanner.nextInt();
		if (nhapso == 1) {
			Set<String> set = map.keySet();
			for (String sv : set) {
				System.out.println("MSV: " + map.get(sv).getMsv() + " Ten: " + map.get(sv).getTen() + " Tuoi: "
						+ map.get(sv).getTuoi() + " DTB: " + map.get(sv).getDtb());

			}
		} else if (nhapso == 2) {
			int kt = 0;
			Set<String> set = map.keySet();
			scanner.nextLine();
			System.out.print("Nhap ma sinh vien can tim");
			String tim = scanner.nextLine();
			for (String timsv : set) {
				if (map.get(timsv).getMsv().equals(tim)) {
					kt = 1;
					System.out.println("MSV: " + map.get(timsv).getMsv() + " Ten: " + map.get(timsv).getTen()
							+ " Tuoi: " + map.get(timsv).getTuoi() + " DTB: " + map.get(timsv).getDtb());
				}
			}
			if (kt == 0) {
				System.out.print("khong co sinh vien can tim");
			}
		}
		if (nhapso == 3) {
			Set<String> set = map.keySet();
			int max = 0;
			for (String timmax : set) {
				if (max < map.get(timmax).getTuoi()) {
					max = map.get(timmax).getTuoi();
				}
			}

			for (String key : set) {
				if (map.get(key).getTuoi() == max) {
					System.out.println(map.get(key).getMsv());
					System.out.println(map.get(key).getTen());
					System.out.println(map.get(key).getTuoi());
					System.out.println(map.get(key).getDtb());
				}
			}
		}else if(nhapso==4) {
//			sửa tên của sinh viên dựa vào key của sinh viên
			Set<String>set=map.keySet();
			int kt=0;
			scanner.nextLine();
			System.out.print("Nhap ma sinh vien can sua");
			String sua = scanner.nextLine();
			for(String change : set) {
				if(map.get(change).getMsv().equals(sua)) {
					kt=1;
					scanner.nextLine();
					System.out.print("Sua ten sinh vien");
					String ten = scanner.nextLine();
					System.out.print("Sua tuoi sinh vien");
					int tuoi = scanner.nextInt();
					System.out.print("Sua diem trung binh");
					int dtb = scanner.nextInt();
//					System.out.print("Sua thanh");
//					String suathanh = scanner.nextLine();
//					map.get(change).setMsv(suathanh);
					map.put(sua, new sinhvien(sua, ten, tuoi, dtb));
				}
			}
			
			for(String afterchange :set) {
				System.out.println(map.get(afterchange).getMsv());
				System.out.println(map.get(afterchange).getTen());
				System.out.println(map.get(afterchange).getTuoi());
				System.out.println(map.get(afterchange).getDtb());
			}
		}
	}

}
