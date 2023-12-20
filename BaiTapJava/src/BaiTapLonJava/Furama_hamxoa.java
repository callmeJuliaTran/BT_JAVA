package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Furama_hamxoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Furama> list = new ArrayList<>();
		System.out.print("Nhap so luong nv");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten nhan vien");
			String tenNV = scanner.nextLine();
			System.out.print("Nhap tuoi nhan vien");
			int tuoiNV = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma nhan vien");
			String maNV = scanner.nextLine();
			System.out.print("Nhap luong nhan vien");
			int luongNV = scanner.nextInt();
			list.add(new Furama(tenNV, tuoiNV, maNV, luongNV));
		}
		int ketqua = hamxoa(list);
		if (ketqua == 1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTenNV() + " " + list.get(i).getTuoiNV() + " " + list.get(i).getMaNV()
						+ " " + list.get(i).getLuongNV());
			}
		} else {
			System.out.print("Nhan vien k ton tai");
		}
	}

	public static int hamxoa(ArrayList<Furama> list) {
		Scanner scanner = new Scanner(System.in);
		int check = 0;
		System.out.print("Nhap ma nhan vien tim nv can xoa");
		String manv = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaNV().equals(manv)) {
				check = 1;
				list.remove(i);
			}

		}
		return check;
	}

}
