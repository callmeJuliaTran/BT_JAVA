package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class TAILIEU_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Xây dựng lớp Tài Liệu mô tả thông tin về tài liệu gồm các thuộc tính mã tài liệu, tên tài liệu, số trang.

//2. Xây dựng lớp Sách mô tả thông tin về tài liệu sách, lớp kế thừa từ lớp Tài liệu và bổ sung thêm các thuộc tính: tên tác giả, đơn giá, năm xuất bản
//- Nhập dữ liệu cho các thuộc tính.(nhập n Sách)
//- Viết chương trình thiết lập và lấy thông tin của các thuộc tính;
		ArrayList<SACH> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong tai lieu");
		int soluong = scanner.nextInt();
		for (int i = 0; i < soluong; i++) {
			scanner.nextLine();
			System.out.print("nhap ma tai lieu");
			String maTL = scanner.nextLine();
			System.out.print("nhap ten tai lieu");
			String tenTL = scanner.nextLine();
			System.out.print("nhap so trang tai lieu");
			int sotrangTL = scanner.nextInt();
			scanner.nextLine();
			System.out.print("TEN TAC GIA");
			String tenTG = scanner.nextLine();
			System.out.print("DON GIA");
			int gia = scanner.nextInt();
			System.out.print("NAM XUAT BAN");
			int nam = scanner.nextInt();
			list.add(new SACH(maTL, tenTL, sotrangTL, tenTG, gia, nam));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getMaTL() + " " + list.get(i).getTenTL() + " " + list.get(i).getSotrang() + " "
					+ list.get(i).getTacgia() + " " + list.get(i).getGia() + " " + list.get(i).getNamxuatban());
		}

	}

}
