package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class tailieu_main {
	// Xây dựng lớp Tài Liệu mô tả thông tin về tài liệu gồm các thuộc tính mã tài
	// liệu, tên tài liệu, số trang.
//	- Nhập dữ liệu cho các thuộc tính.(nhập n Tài liệu)
//	- Viết chương trình lấy thông tin thuộc tính số trang

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<tailieu> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong tai lieu");
		int soluong = scanner.nextInt();
		for (int i = 0; i < soluong; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma tai lieu");
			String maTL = scanner.nextLine();
			System.out.print("Nhap ten tai lieu");
			String tenTL = scanner.nextLine();
			System.out.print("Nhap so trang tai lieu");
			int sotrang = scanner.nextInt();
			list.add(new tailieu(maTL, tenTL, sotrang));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getMaTL() + " " + list.get(i).getTenTL() + " " + list.get(i).getSotrang());
		}

	}

}
