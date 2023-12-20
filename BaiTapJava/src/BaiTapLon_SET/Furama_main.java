package BaiTapLon_SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Arraylist2.Nhanvien;
import sun.security.util.ManifestEntryVerifier;

public class Furama_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Để Furama vào hoạt động được thì mình phải xây dựng khu nghỉ dưỡng. Ban đầu mình xây dựng Furama 
//		có 5 cái Villa , 2 cái House và 1 hồ bơi. Một cái Villa thì có 1 cái giường . Nếu Khách có thuê cái Villa thì 
//		phải trả tiền 1 ngày là 10 USD. Một cái House thì có 4 cái giường. Nếu khách thuê 1 ngày thì trả 5 USD. 
//		Hồ bơi thì mở cửa lúc 10 sáng hằng ngày
//		Bộ phận nhân sự của Furama cần 1 cái tủ để đựng hồ sơ của nhân viên. Khi có nhân viên nào muốn tìm 
//		hồ sơ của mình thì bộ phận nhân sự sẽ lục trong tủ hồ sơ
//		Task 1 .Gỉa sử có 10 nhân viên gồm tên tuổi,mã nhân viên, lương, tìm tên nhân viên, và in thông tin nhân 
//		viên đó ra màng hình
//		Task 2.Sắp xếp giảm dần tuổi của nhân viên
//		Task 3.Tìm tuổi của nhân viên lớn nhất
//		Task 4.Thêm 1 nhân viên vào vị trí bất kì
//		Task 5. Xóa nhân viên theo mã nhân viên
//		Task 6.Hiểm thị các nhân viên có tiền lương lớn thứ 2

		Scanner scanner = new Scanner(System.in);
		Set<Furama> listNhanviens = new HashSet<>();
		System.out.print("Nhap so luong nhan vien");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten nv");
			String ten = scanner.nextLine();
			System.out.print("Nhap tuoi nv");
			int tuoi = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ma nv");
			String ma = scanner.nextLine();
			System.out.print("Nhap luong nv");
			int luong = scanner.nextInt();
			listNhanviens.add(new Furama(ten, tuoi, ma, luong));
		}

		System.out.println("Nhap 1 in thông tin nhân viên đó ra màng hình");
		System.out.println("Nhap 2 Sắp xếp giảm dần tuổi của nhân viên");
		System.out.println("Nhap 3 Tìm tuổi của nhân viên lớn nhất");
		System.out.println("Nhap 4 Thêm 1 nhân viên vào vị trí bất kì");
		System.out.println("Nhap 5 Xóa nhân viên theo mã nhân viên");
		System.out.println("Nhap 6 Hiểm thị các nhân viên có tiền lương lớn thứ 2");
		int nhapso = scanner.nextInt();

		if (nhapso == 1) {
			for (Furama i : listNhanviens) {
				System.out.println(i.getTen() + " " + i.getTuoi() + " " + i.getMa() + " " + i.getLuong());

			}
		} else if (nhapso == 2) {
			ArrayList<Furama> arrayList = new ArrayList<>();
			arrayList.addAll(listNhanviens);
			for (int i = 0; i < arrayList.size(); i++) {
				for (int j = i + 1; j < arrayList.size(); j++) {
					if (arrayList.get(j).getTuoi() > arrayList.get(i).getTuoi()) {
						Furama t = arrayList.get(i);
						arrayList.set(i, arrayList.get(j));
						arrayList.set(j, t);
					}
				}
			}
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i).ten + " " + arrayList.get(i).tuoi + " " + arrayList.get(i).ma + " "
						+ arrayList.get(i).luong);
			}

		} else if (nhapso == 3) {
			int max = 0;
			for (Furama tuoimax : listNhanviens) {
				if (tuoimax.getTuoi() > max) {
					max = tuoimax.getTuoi();
				}
			}
			for (Furama tuoimax_b : listNhanviens) {
				if (max == tuoimax_b.getTuoi()) {
					System.out.print(tuoimax_b.ten + " " + tuoimax_b.tuoi + " " + tuoimax_b.ma + " " + tuoimax_b.luong);
				}

			}
		} else if (nhapso == 4) {
			int kt4 = 0;
			ArrayList<Furama> addList = new ArrayList<>(); // chu y
			addList.addAll(listNhanviens);
			System.out.print("Vi tri nhan vien them");
			int vt = scanner.nextInt();
			for (int i = 0; i < addList.size(); i++) {
				if (vt == i) {
					kt4 = 1;
					System.out.println("Nhap nhan vien can them");
					scanner.nextLine();
					System.out.print("Nhap ten nv");
					String newten = scanner.nextLine();
					System.out.print("Nhap tuoi nv");
					int newtuoi = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhap ma nv");
					String newma = scanner.nextLine();
					System.out.print("Nhap luong nv");
					int newluong = scanner.nextInt();
					addList.add(vt, new Furama(newten, newtuoi, newma, newluong)); // chu y
				}
			}

			if (kt4 == 1) {
				for (int i = 0; i < addList.size(); i++) {
					System.out.println(addList.get(i).getTen() + " " + addList.get(i).getTuoi() + " "
							+ addList.get(i).getMa() + " " + addList.get(i).getLuong());
				}
			} else {
				System.out.print("k ton tai");
			}

		} else if (nhapso == 5) {
			int kt = 0;
			scanner.nextLine();
			System.out.print("Nhap ma nv can tim");
			String timma = scanner.nextLine();
			for (Furama manv : listNhanviens) {
				if (timma.equals(manv.getMa())) {
					kt = 1;
					listNhanviens.remove(manv);
					break;
				}
			}
			if (kt == 0) {
				System.out.print("Ma nv can tim khong ton tai");
			} else if (kt == 1) {
				for (Furama nv : listNhanviens) {
					System.out.print(nv.getTen() + " " + nv.getTuoi() + " " + nv.getMa() + " " + nv.getLuong());
				}
			}
		} else if (nhapso == 6) {
			ArrayList<Furama> luongList = new ArrayList<>();
			luongList.addAll(listNhanviens);
			for (int i = 0; i < luongList.size(); i++) {
				for (int j = i + 1; j < luongList.size(); j++) {
					if (luongList.get(j).getLuong() > luongList.get(i).getLuong()) {
						Furama t = luongList.get(i);
						luongList.set(i, luongList.get(j));
						luongList.set(j, t);

					}
				}
			}
			for (int i = 0; i < luongList.size(); i++) {
			}
			System.out.print(luongList.get(1).getTen() + " " + luongList.get(1).getTuoi() + " "
					+ luongList.get(1).getMa() + " " + luongList.get(1).getLuong());

		}
	}

}
