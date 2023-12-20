package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.sun.tools.javac.comp.Check;

import jdk.jfr.snippets.Snippets.Temperature;

public class Furama_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Để Furama vào hoạt động được thì mình phải xây dựng khu nghỉ dưỡng. Ban đầu mình xây dựng Furama 
//		có 5 cái Villa , 2 cái House và 1 hồ bơi. Một cái Villa thì có 1 cái giường . Nếu Khách có thuê cái Villa thì 
//		phải trả tiền 1 ngày là 10 USD. Một cái House thì có 4 cái giường. Nếu khách thuê 1 ngày thì trả 5 USD. 
//		Hồ bơi thì mở cửa lúc 10 sáng hằng ngày
//		Bộ phận nhân sự của Furama cần 1 cái tủ để đựng hồ sơ của nhân viên. Khi có nhân viên nào muốn tìm 
//		hồ sơ của mình thì bộ phận nhân sự sẽ lục trong tủ hồ sơ
//		

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
		// Task 1 .Gỉa sử có 10 nhân viên gồm tên tuổi,mã nhân viên, lương, tìm tên nhân
		// viên, và in thông tin nhân viên đó ra màng hình
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(
//					list.get(i).tenNV + " " + list.get(i).tuoiNV + " " + list.get(i).maNV + " " + list.get(i).luongNV);
//		}
//
////		Task 2.Sắp xếp giảm dần tuổi của nhân viên
//		for (int i = 0; i < list.size(); i++) {
//	for(int j =i+i;j<list.size();j++)
//			if (list.get(j).getTuoiNV() >list.get(i).getTuoiNV()) { // 2 3 5 4 // dung list.set
//				Furama t = list.get(i);
//				list.set(i, list.get(j));
//				list.set(j, t);
//			}
//			
//		}
//		for(int i =0;i<list.size();i++) {
//			System.out.println(
//					list.get(i).tenNV + " " + list.get(i).tuoiNV + " " + list.get(i).maNV + " " + list.get(i).luongNV);
//		}
//		// Task 3.Tìm tuổi của nhân viên lớn nhất
//		int max = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTuoiNV() > max) {
//				max = list.get(i).getTuoiNV();
//			}
//		}
//		System.out.print("Tuoi nv lon nhat la " + max);

//	Task 4.Thêm 1 nhân viên vào vị trí bất kì
//		int kt = 0;
//		System.out.print("Nhap vi tri muon them");
//		int vt = scanner.nextInt();
//		for (int i = 0; i < list.size(); i++) {
//			if (vt == i) {
//				kt = 1;
//		System.out.print("Nhap thong tin nhan vien moi");
//		scanner.nextLine();
//		System.out.print("Nhap ten nhan vien");
//		String tenNV = scanner.nextLine();
//		System.out.print("Nhap tuoi nhan vien");
//		int tuoiNV = scanner.nextInt();
//		scanner.nextLine();
//		System.out.print("Nhap ma nhan vien");
//		String maNV = scanner.nextLine();
//		System.out.print("Nhap luong nhan vien");
//		int luongNV = scanner.nextInt();
//		list.add(vt,new Furama(tenNV, tuoiNV, maNV, luongNV));
//			}
//		}
//		if (kt == 1) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getTenNV() + " " + list.get(i).getTuoiNV() + " " + list.get(i).getMaNV()
//						+ " " + list.get(i).getLuongNV());
//			}
//		}
////		Task 5. Xóa nhân viên theo mã nhân viên
//		int kt5 = 0;
//		scanner.nextLine();
//		System.out.print("Nhap ma nhan vien can xoa");
//		String manv = scanner.nextLine();
//		for (int i = 0; i < list.size(); i++) {
//			if (manv.equals(list.get(i).getMaNV())) {
//				kt5 = 1;
//				list.remove(list.get(i));
//			}
//		}
//		if (kt5 == 1) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getTenNV() + " " + list.get(i).getTuoiNV() + " " + list.get(i).getMaNV()
//						+ " " + list.get(i).getLuongNV());
//			}
//		} else {
//			System.out.print("Ma nhan vien khong ton tai");
//		}
//
////		Task 6.Hiểm thị các nhân viên có tiền lương lớn thứ 2
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + i; j < list.size(); j++) {
				if (list.get(i).getLuongNV() > list.get(j).getLuongNV()) {
					Furama t = list.get(i);
					list.set(i, list.get(j));
					list.set(j, t);
				}
			}
		}
		System.out.println(list.get(1).getTenNV() + " " + list.get(1).getTuoiNV() + " " + list.get(1).getMaNV() + " "
				+ list.get(1).getLuongNV());

		
	}
	
	

}
