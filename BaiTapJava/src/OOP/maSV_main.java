package OOP;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.beans.decoder.StringElementHandler;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class maSV_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<maSV> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong Nhan Vien");
		int soluongNV = scanner.nextInt();
		for (int i = 0; i < soluongNV; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma Nhan Vien");
			String maNV = scanner.nextLine();
			System.out.print("Nhap ten Nhan Vien");
			String tenNV = scanner.nextLine();
			System.out.print("Nhap tuoi Nhan Vien");
			int tuoiNV = scanner.nextInt();
			list.add(new maSV(maNV, tenNV, tuoiNV));
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getMaNV()+" "+ list.get(i).getTenNV()+" "+list.get(i).getTuoiNV());
		}
	}

}
