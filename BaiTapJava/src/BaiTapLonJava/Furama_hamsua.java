package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Furama_hamsua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Furama hiện tại đã có 10 nhân viên làm việc . Mỗi nhân viên đều có 1 mã số duy nhất ứng với tên của 
//	mình. Ví du Mã số 001 
//	Tên Nhân Viên là Nguyễn Thị B và tuổi 17
//	Task 2: Hiện tại 10 nhân viên người nhập vào sai thông tin, cần sữa lại thông tin của nhân viên;
//	Viết một vàm sữa và hàm xóa thông tin của nhân viên
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
		int goiham = hamsua(list);
		if (goiham >= 0) {
			System.out.print("Nhap thong tin can sua thong tin dung co the giu nguyen");
			scanner.nextLine();
			System.out.print("Nhap ten nhan vien");
			String newtenNV = scanner.nextLine();
			System.out.print("Nhap tuoi nhan vien");
			int newtuoiNV = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma nhan vien");
			String newmaNV = scanner.nextLine();
			System.out.print("Nhap luong nhan vien");
			int newluongNV = scanner.nextInt();

			list.get(goiham).setTenNV(newtenNV);
			list.get(goiham).setTuoiNV(newtuoiNV);
			list.get(goiham).setMaNV(newmaNV);
			list.get(goiham).setLuongNV(newluongNV);

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTenNV() + " " + list.get(i).getTuoiNV() + " " + list.get(i).getMaNV()
						+ " " + list.get(i).getLuongNV());

			}
		} else {
			System.out.print("Nhan vien k ton tai");
		}
	}

	public static int hamsua(ArrayList<Furama> list) {
		Scanner scanner = new Scanner(System.in);
		int check = -1;  
		System.out.print("Nhap ma nhan vien tim nv can sua");
		String manv = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaNV().equals(manv)) {
				check = i;
			}

		}
		return check;
	}
}
