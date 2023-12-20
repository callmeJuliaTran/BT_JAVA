package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class sach2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xây dựng lớp Sách mô tả thông tin về sach gồm mã sách, tên sách, tên tác giả, năm xuất bản
//		1 Nhập dữ liệu cho các thuộc tính.(nhập n Sách)
//		2. Hiển thị các quyển  sách có năm xuất bản lớn hơn 1991
//		3. Tìm quyển sách có năm xuất bản nhỏ nhất
//		4. đếm xem có bao nhiêu quyển sách có năm xuất bản lớn hơn 1991
//		5.Tìm 1 quyển sách dựa vào mã sách
		Scanner scanner = new Scanner(System.in);
		ArrayList<sach2> list = new ArrayList<>();
		System.out.print("Nhap so luong sach");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("nhap ma sach");
			String maSach = scanner.nextLine();
			System.out.print("Nhap ten sach");
			String tenSach = scanner.nextLine();
			System.out.print("Nhap ten tac gia");
			String tenTacgia = scanner.nextLine();
			System.out.print("Nhap nam xuat ban");
			int nam = scanner.nextInt();
			list.add(new sach2(maSach, tenSach, tenTacgia, nam));
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNam() > 1991) {
				System.out.println("Cac sach co nam xuat ban lon hon 1991 la " + list.get(i).getTenSach() + " "
						+ list.get(i).getNam());
			}
		}
		int min = list.get(0).getNam();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNam() < min) {
				min = list.get(i).getNam();
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getNam() == min) {
				System.out.println(
						"Sach co nam xuat ban nho nhat la " + list.get(j).getTenSach() + " " + list.get(j).getNam());
			}
		}
		int dem = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNam() > 1991) {
				dem = dem + 1;

			}
			System.out.print("co " + dem + " co nam xuat ban lon hon 1991");
		}
		scanner.nextLine();
		System.out.print("Nhap ma sach can tim");
		String timMaSach = scanner.nextLine();
		int kt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (timMaSach.equals(list.get(i).getMaSach())) {
				kt = 1;
				System.out.println(list.get(i).getMaSach() + " " + list.get(i).getTenSach() + " "
						+ list.get(i).getTenTacgia() + " " + list.get(i).getNam());
			}
		}
		if (kt == 0) {
			System.out.print("Ma sach khong ton tai");
		}
	}
}