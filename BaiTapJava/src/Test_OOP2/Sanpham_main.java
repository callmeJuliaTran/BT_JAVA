package Test_OOP2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

import com.sun.tools.javac.util.List;

public class Sanpham_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<Sanpham> list = new ArrayList<>();
		System.out.println("Nhap so luong san pham");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.println("Nhap ten san pham");
			String tenSp = scanner.nextLine();
			System.out.print("Nhap gia san pham");
			int donGia = scanner.nextInt();
			System.out.print("Nhap giam gia sam pham");
			int giamGia = scanner.nextInt();
			System.out.print("Nhap nam san xuat");
			int namSX = scanner.nextInt();
			list.add(new Sanpham(tenSp, donGia, giamGia, namSX));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTenSp() + " " + list.get(i).getDonGia() + " " + list.get(i).getGiamGia()
					+ " " + list.get(i).getNamSX());
		}
//		int dem = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getDonGia() == 100) {
//				dem = dem + 1;
//			}
//			System.out.println("co " + dem + " sam pham co don gia 100");
//		}
		scanner.nextLine();
		int kt = 0;
		System.out.println("Nhap san pham muon sua");
		String suatenSp = scanner.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTenSp().equals(suatenSp)) {
				kt = 1;
				System.out.println("Sua ten san pham thanh");
				String suatenSpthanh = scanner.nextLine();
				list.get(i).setTenSp(suatenSpthanh);
			}
		}
		if (kt == 0) {
			System.out.println("San pham can sua khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTenSp());
			}
		}

		scanner.nextLine();
		int kt1 = 0;
		System.out.println("Nhap san pham muon xoa");
		String xoa = scanner.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTenSp().equals(xoa)) {
				kt1 = 1;
				list.remove(i);
			}
		}
		if (kt1 == 0) {
			System.out.println("San pham can xoa khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTenSp() + " " + list.get(i).getDonGia() + " " + list.get(i).getGiamGia()
						+ " " + list.get(i).getNamSX());
			}
		}
		scanner.nextLine();
		int kt2 = 0;
		System.out.println("Nhap san pham muon tim");
		String tim = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTenSp().equals(tim)) {
				kt2 = 1;
			}
			System.out.println(list.get(i).getTenSp() + " " + list.get(i).getDonGia() + " " + list.get(i).getGiamGia()
					+ " " + list.get(i).getNamSX());
		}
		if (kt2 == 0) {
			System.out.println("San pham can tim khong ton tai");
		}

		int max = list.get(0).getDonGia();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDonGia() > max) {
				max = list.get(i).getDonGia();
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getDonGia() == max) {
				System.out.println("San pham gia lon nhat la " + list.get(j).getTenSp() + " " + list.get(j).getDonGia()
						+ " " + list.get(j).getGiamGia() + " " + list.get(j).getNamSX());
			}
		}

		int min = list.get(0).getDonGia();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDonGia() > min) {
				min = list.get(i).getDonGia();
			}
		}
		for (int k = 0; k < list.size(); k++) {
			if (list.get(k).getDonGia() == min) {
				System.out.println("San pham gia nho nhat la " + list.get(k).getTenSp() + " " + list.get(k).getDonGia()
						+ " " + list.get(k).getGiamGia() + " " + list.get(k).getNamSX());
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNamSX() > 200) {
				System.out.println("San pham co nam san xuat lon hon 200 la " + list.get(i).getNamSX());
			}
		}

		int dem2 = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNamSX() > 150) {
				dem2 = dem2 + 1;
			}
			System.out.println("co " + dem2 + " sam pham co nam san xuat lon hon 150");
		}
		int max1 = list.get(0).getDonGia();
		int min1 = list.get(0).getDonGia();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDonGia() > max1) {
				max1 = list.get(i).getDonGia();
				min1 = list.get(i).getDonGia();
			}
			System.out.println("Tong = " + (max1 + min1));

		}

	}

}
