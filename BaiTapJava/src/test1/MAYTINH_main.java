package test1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.Document;

import com.sun.beans.decoder.StringElementHandler;
import com.sun.org.apache.xpath.internal.operations.Equals;

import jdk.internal.net.http.hpack.HPACK;

public class MAYTINH_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tạo 1 class máy tính gồm các thuộc tính, mã máy tính,tên,loại,năm sản xuất

		Scanner scanner = new Scanner(System.in);
		ArrayList<MAYTINH> list = new ArrayList<>();
		System.out.print("Nhap so luong may tinh");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ma may tinh");
			String ma = scanner.nextLine();
			System.out.print("Nhap ten may tinh");
			String ten = scanner.nextLine();
			System.out.print("Nhap loai may tinh");
			String loai = scanner.nextLine();
			System.out.print("Nhap nam san xuat may tinh");
			int nam = scanner.nextInt();
			System.out.print("Nhap gia may tinh");
			int gia = scanner.nextInt();
			list.add(new MAYTINH(ma, ten, loai, nam, gia));
		}
////		1.Nhập n máy tính, và in tất cả máy tính có trong mảng
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getMa() + " " + list.get(i).getTen() + " " + list.get(i).getLoai() + " "
//					+ list.get(i).getNam());
//		}
////		2.Sửa tên máy tính dựa vào mã máy tính
//		scanner.nextLine();
//		int kt = 0;
//		System.out.print("Nhap ma sp muon sua");
//		String ma = scanner.nextLine();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getMa().equals(ma)) {
//				kt = 1;
//				System.out.println("Sua ten san pham thanh");
//				String suatenthanh = scanner.nextLine();
//				list.get(i).setTen(suatenthanh);
//			} // System.out.print(suatenthanh);
//		}
//		if (kt == 0) {
//			System.out.println("San pham can sua khong ton tai");
//		} else {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getTen());
//
//			}
//		}
//
////		3.Xóa thông tin của một máy tính
//		scanner.nextLine();
//		int kt1 = 0;
//		System.out.println("Nhap ten muon xoa");
//		String xoa = scanner.nextLine();
//
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTen().equals(xoa)) {
//				kt1 = 1;
//				list.remove(i);
//			}
//		}
//		if (kt1 == 0) {
//			System.out.println("San pham can xoa khong ton tai");
//		} else {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getMa() + " " + list.get(i).getTen() + " " + list.get(i).getLoai() + " "
//						+ list.get(i).getNam());
//			}
//		}
//
////		4.Tìm kiếm một máy tính
//		scanner.nextLine();
//		int kt2 = 0;
//		System.out.println("Nhap ten muon tim");
//		String tim = scanner.nextLine();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTen().equals(tim)) {
//				kt2 = 1;
//			}
//		}
//		if (kt2 == 0) {
//			System.out.println("May tinh can tim khong ton tai");
//		} else {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getMa() + " " + list.get(i).getTen() + " " + list.get(i).getLoai() + " "
//						+ list.get(i).getNam());
//
//			}
//		}
////		2.sửa tên, giá, dựa vào mã máy tính
//		scanner.nextLine();
//		int kt3 = 0;
//		System.out.println("Nhap ma may tinh muon sua");
//		String sua = scanner.nextLine();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getMa() == sua) {
//				kt = 1;
//				scanner.nextLine();
//				System.out.println("Sua ten thanh");
//				String suatenthanh2 = scanner.nextLine();
//				System.out.print("Sua gia thanh");
//				int suagia = scanner.nextInt();
//			}
//		}
//		
//		if(kt==0) {
//			System.out.println("May tinh can tim khong ton tai");
//		}
//
////		3.đếm xem có bao nhiêu máy tính sản xuất năm 2000
//		int dem =0;
//		scanner.nextLine();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getNam()==2000) {
//				dem=dem + 1;
//			}
//		}System.out.println(dem);
//
////		6.tíng tiền máy tính có năm sản xuất là 100
//		scanner.nextLine();
//		int kt4=0;
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getNam()==100) {
//				kt4=1;
//				System.out.println(list.get(i).getGia());
//			}
//		}
//		if(kt4==0) {
//				System.out.println("May tinh ban tim da het hang");
//		}
//		
//////		8. Năm 2001 và năm 2002 năm nào sản xuất ra nhiều máy tính hơn
//		int dem2001 =0;
//		int dem2002 =0;
//		scanner.nextLine();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getNam()==2001) {
//				dem2001=dem2001 + 1;
//			}
//		}System.out.println(dem2001);
//		
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getNam()==2002) {
//				dem2002=dem2002 + 1;
//			}
//		}System.out.println(dem2002);
//		
//		if(dem2001>dem2002) {
//			System.out.print("Nam 2001 san xuat nhieu may tinh hon");
//		}else if(dem2002>dem2001) {
//			System.out.print("Nam 2002 san xuat nhieu may tinh hon");
//		}else if(dem2001==dem2002) {
//			System.out.print("hai nam san xuat bang nhau");
//		}
//
////		9. Tính tổng mây tính sản xuất 3 năm gần nhất
//		int tong = 0;
//
//		scanner.nextLine();
//		for (int i = 0; i < list.size(); i++) { // 3 5 2 7
//			for (int j = i + 1; j < list.size(); j++) {
//				if (list.get(i).getNam() < list.get(j).getNam()) {
//					MAYTINH t = list.get(i); // KIEU DU LIEU LA OBJECT(MAYTINH)
//					list.set(i, list.get(j));
//					list.set(j, t);
//				}
//			}
//		}System.out.println(list.get(0).getNam() + " " + list.get(1).getNam() + " " + list.get(2).getNam());
//		int dem1 = 0;
//			for (int i = 0; i < list.size(); i++) { // dem ma may tinh
//				if (list.get(i).getMa().equals(list.get(0).getMa()) || list.get(i).getMa().equals(list.get(1).getMa())
//						|| list.get(i).getMa().equals(list.get(2).getMa())) {
//					dem1 = dem1 + 1;
//				}
//			}
//			System.out.println(dem1);
//			10. Có bao nhiêu dòng máy tính được sản xuất ra nam 2000
		int dem5 = 0;
		String dongmay = ""; // " " them 2 nhay cho kieu du lieu string
		scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNam() == 2000) { // hp dell
				dongmay = list.get(i).getLoai();
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLoai().equals(dongmay)) {
				dem5++;
			}	
		}System.out.print(dem5);
	}

	// năm 2000 có bao nhiêu máy tính được sản xuất ra
//		scanner.nextLine();
//		int dem6 = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getNam() == 2000) {
//				dem6 = dem6 + 1;
//			}
//		}
//		System.out.print(dem6);
//	}

	private static MAYTINH get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
