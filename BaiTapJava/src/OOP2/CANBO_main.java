package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.beans.introspect.PropertyInfo.Name;

public class CANBO_main {
//	Xây dựng lớp Canbo mô tả thông tin về cán bộ, bao gồm các thuộc tính: Mã cán bộ,
//	họ tên, giới tính (nam hoặc nữ). Viết các phương thức cho lớp Canbo bao gồm:
//	- Nhập dữ liệu cho các thuộc tính.(nhập 5 cán bộ)
//	- Hiển thị thông tin của cán bộ
//	- Trả về giá trị  thuộc tính họ tên của cán bộ
//	Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//	từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//	. Viết các phương thức cho lớp Congnhan bao gồm:
//	- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//	- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<CONGNHAN> list = new ArrayList<>();

		int n = 5;
		for (int i = 0; i < 5; i++) {
			System.out.print("Nhap ma can bo");
			String maCB = scanner.nextLine();
			System.out.print("Nhap ten can bo");
			String tenCB = scanner.nextLine();
			System.out.print("Nhap gioi tinh can bo");
			String gioitinhCB = scanner.nextLine();
			System.out.print("Nhap bac cong nhan");
			int bacCN = scanner.nextInt();
			System.out.print("Nhap so ngay lam viec");
			int ngaylamviecCN = scanner.nextInt();
			System.out.print("Nhap tien luong");
			int tienluongCN = scanner.nextInt();
			list.add(new CONGNHAN(maCB, tenCB, gioitinhCB, bacCN, ngaylamviecCN, tienluongCN));

		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					list.get(i).getMaCB() + " " + list.get(i).getHotenCB() + " " + list.get(i).getNgaylamviecCN() + " "
							+ list.get(i).getBacCN() + " " + list.get(i).getTienluongCN());

		}

	}

}
