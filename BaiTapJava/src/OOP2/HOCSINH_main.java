package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class HOCSINH_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tạo 1 class học sinh gồm mã học sinh, tên học sinh, điểm trung bình
//		1 nhập n học sinh và in ra các học sinh
//		2 hiển thị học sinh có điểm trung bình tổng cao nhất
//		3 tìm học sinh có điểm trung bình cao hơn 7
//		4. Đếm xem có bao nhiêu học sinh có tổng điểm hơn hơn 6 bé hơn 9

		// viết class học sinh gồm mã học sinh,tên,tuổi
		// sửa tên học sinh dựa vào mã học sinh
		// xóa học sinh dựa vào mã học sinh
		Scanner scanner = new Scanner(System.in);
		ArrayList<HOCSINH> list = new ArrayList<>();
		System.out.print("Nhap so luong hoc sinh");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("nhap ma hoc sinh");
			String maHS = scanner.nextLine();
			System.out.print("Nhap ten hoc sinh");
			String tenHS = scanner.nextLine();
			System.out.print("Nhap diem trung binh");
			double DTB = scanner.nextDouble();
			list.add(new HOCSINH(maHS, tenHS, DTB));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getMaHS() + " " + list.get(i).getTenHS() + " " + list.get(i).getDTB());
		}
		double max = list.get(0).getDTB();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDTB() > max) {
				max = list.get(i).getDTB();
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getDTB() == max) {
				System.out.println("Khach hang lon tuoi nhat la " + list.get(j).getMaHS() + " " + list.get(j).getTenHS()
						+ " " + list.get(j).getDTB());
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDTB() > 7) {
				System.out.println("Hoc sinh co diem trung binh lon hon 7 la " + list.get(i).getTenHS() + " "
						+ list.get(i).getDTB());
			}

		}
		int dem = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDTB() > 6 && list.get(i).getDTB() < 9) {
				dem = dem + 1;
			}
			System.out.println("Co " + dem + " hoc sinh co diem trung binh lon hon 6 va be hon 9");
		}
		scanner.nextLine();
		System.out.println("Nhap ma hoc sinh muon sua ");
		String masua = scanner.nextLine();
		int kt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaHS().equals(masua)) {
				kt = 1;
				System.out.print("sua thanh");
				String sua = scanner.nextLine();
				list.get(i).setMaHS(sua);
			}
		}
		if (kt == 0) {
			System.out.println("Ma hoc sinh can sua khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getMaHS());
			}
		}

		scanner.nextLine();
		System.out.println("Nhap ma hoc sinh muon xoa ");
		String xoa = scanner.nextLine();
		int kt1 = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaHS().equals(xoa)) {
				kt1 = 1;
				list.remove(i);
			}
		}
		if (kt == 0) {
			System.out.println("Phan tu muon xoa khong ton tai");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getMaHS() + " " + list.get(i).getTenHS() + " " + list.get(i).getDTB());
			}
		}

	}
}
