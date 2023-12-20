package BaiTapLonJava;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

import OOP.tinhtong;
import sun.security.mscapi.CRSACipher;

public class Furama_xe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hằng ngày có rất nhiều chuyến xe ra vào Furama. Chúng ta cần một nơi để lưu trữ số lần có mỗi chiếc xe 
//		du lich vào Furama. Ví dụ có 1 chiếc xe vào thì mình lưu lại bản số xem và cuối ngày mình xem có bao 
//		nhiêu xe đi vào Furama: Class xe gồm tên xe, biển số xe, loại xe 
//		Task 1 Tạo ArrayList để lưu trữ Khi có một xe vào thì add vào ArrayList Viết 1 hàm để duyệt qua các 
//		biển số xe trong ngày,
//		+Tính tổng số xe trong 1 ngày
//		+Tính tiền thu được. biết 1 xe/10.000đ

		Scanner scanner = new Scanner(System.in);
		ArrayList<Furama_xe> list = new ArrayList<Furama_xe>();
		System.out.print("Nhap so luong xe");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten xe");
			String tenxe = scanner.nextLine();
			System.out.print("Nhap bien so xe");
			String bienso = scanner.nextLine();
			System.out.print("Nhap loai xe");
			String loaixe = scanner.nextLine();
			list.add(new Furama_xe(tenxe, bienso, loaixe));
		}

		int goiham = tong(list);

		System.out.println("co " + goiham + " xe");
		System.out.println("co " + goiham * 10);
	}

	public static int tong(ArrayList<Furama_xe> list) {
		int tong = 0;
		int kt = 1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBienso().equals("0")) {  // so sanh String de " "
			} else {
				tong++;
			}
		}
		return tong;
	}

}
