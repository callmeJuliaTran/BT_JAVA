package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.sun.media.sound.ModelInstrumentComparator;

import Arraylist2.map;

public class Congnhan_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//		từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//		. Viết các phương thức cho lớp Congnhan bao gồm:
//		- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//		- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền
//		lương. Biết rằng: Tiền lương = số ngày làm việc * tiền công nhật. Trong đó tiền công nhật
//		= 400000/ngày đối với bậc là 1, 450000/ngày đối với bậc 2 và 500000/ngày đối với bậc 3

		Scanner scanner = new Scanner(System.in);
		Map<String, Congnhan> map = new HashMap<>();
		System.out.print("Nhap so luong can bo");
		int n = scanner.nextInt();
		int luong = 1;
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma");
			String ma = scanner.nextLine();
			System.out.print("Nhap ten");
			String ten = scanner.nextLine();
			System.out.print("Nhap gioi tinh");
			String gt = scanner.nextLine();
			System.out.print("Nhap bac");
			int bac = scanner.nextInt();
			System.out.print("Nhap so ngay lam viec");
			int ngaylamviec = scanner.nextInt();
			if (bac == 1) {
				luong = ngaylamviec * 400000;
			} else if (bac == 2) {
				luong = ngaylamviec * 450000;
			} else if (bac == 3) {
				luong = ngaylamviec * 500000;
			}
			map.put(ma, new Congnhan(ma, ten, gt, bac, ngaylamviec, luong));
		}
		Set<String> set = map.keySet();
		for (String i : set) {
			System.out.println(" MA: "+map.get(i).getMa() + " TEN: " + map.get(i).getTen() + " GIOI TINH: " + map.get(i).getGt() + " BAC: "
					+ map.get(i).getBac() + " NGAY LAM VIEC: " + map.get(i).getNgaylamviec()+" LUONG: "+ map.get(i).getLuong());
		}

	}

}
