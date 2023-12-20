package Bai3_BaitapJava;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

import com.sun.tools.javac.tree.JCTree.LetExpr;

import OOP.tinhtong;
import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tạo mảng gồm n phần tử
//		1. Nhập n phần tử, in ra các phần tử
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Nhap so luong phan tu cho mang");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			list.add(scanner.nextInt());
		}

//		2. Hiển thị các số dương có trong mảng
//		for(int i =0;i<list.size();i++) {
//			if(list.get(i)>0) {
//				System.out.println(list.get(i));
//			}
//		}
//		3.mảng có bao nhiêu số lẻ, tính tổng các số lẻ(viết hàm)
//		int dem3=0;
//		int tong3 =0;
//		for(int i =0;i<list.size();i++) {
//			if(list.get(i)%2!=0) {
//				dem3 = dem3+1;
//				tong3 = tong3 +list.get(i);
//			}
//		}
//		System.out.println("co " + dem3 + " so le va co tong bang " + tong3);

//		4. Tổng các phần tử trong mảng, phải là số nguyên tố hay không( viết 
//		hàm)

//		int kt4 = 1;
//		int tong4 = 0;
//		for (int i = 0; i < list.size(); i++) {
//			tong4 = tong4 + list.get(i);
//		}
//		for (int j = 2; j < tong4; j++) {
//			if (tong4 % j == 0) {
//				kt4 = 0;
//			}
//		}
//
//		if (kt4 == 0) {
//			System.out.print("Tong cac phan tu trong mang khong phai la so nguyen to");
//		} else if (kt4 == 1) {
//			System.out.print("Tong cac phan tu trong mang la so nguyen to");
//
//		}

//		5.phần tử nào trong mảng là số nguyên tố thì in ra màng hình
//		int kt5 = 1;
//		for (int i = 0; i < list.size(); i++) {// 11 12 13 14
//			kt5 = 1;
//			for (int j = 2; j < list.size(); j++) {
//				if (list.get(i) % j == 0) {
//					kt5 = 0;
//				}
//			}
//			if (kt5 == 1 && list.get(i) > 1) {
//				System.out.println(list.get(i));
//			}
//		}
//		6. Thêm 1 phần tử vào vị trí bất kỳ
//		int kt6 = 0;
//		System.out.println("Nhap vị tri muon them");
//		int vt6 = scanner.nextInt();
//		for (int i = 0; i < list.size(); i++) {
//			if (i == vt6) {
//				kt6 = 1;
//				System.out.println("Nhap phan tu muon them");
//				list.add(vt6,scanner.nextInt());
//			}
//		}
//		if (kt6 == 1) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//		}

//		7. Sửa 1 phần tử
//		int kt7 = 0;
//		System.out.print("Nhap phan tu muon sua");
//		int sua7 = scanner.nextInt();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) == sua7) {
//				kt7 = 1;
//				System.out.print("Sua thanh");
//				{
//					list.set(i, scanner.nextInt());
//				}
//			}
//		}
//		if (kt7 == 1) {
//			System.out.println("pt co trong mang");
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//		} else {
//			System.out.println("pt k co trong mang");
//		}
//
////		8. Xoá 1 phần tử
//		int kt8 = 0;
//		System.out.println("Nhap phan tu can xoa");
//		int xoa8 = scanner.nextInt();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) == xoa8) {
//				kt8 = 1;
//				list.remove(i);
//			}
//		}
//		if (kt8 == 0) {
//			System.out.println("Phan tu can xoa khong ton tai");
//		} else if (kt8 == 1) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//		9.Tìm kiếm 1 phần tử
//		int kt9 = 0;
//		System.out.print("Nhap phan tu can tim");
//		int tim9 = scanner.nextInt();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) == tim9) {
//				kt9 = 1;
//				System.out.print("Phan tu can tim co trong mang va o vi tri thu " + i);
//			}
//		}
//		if (kt9 == 0) {
//			System.out.print("Phan tu can tim khong co trong mang");
//		}

//		10. Phần tử thứ 2 và phần tử cuối cùng trong mảng có đối xứng 
//		không(viết hàm)  // 1 3 5 7 3 
//		int kt10 = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(1) == list.get(n - 1)) {
//				kt10 = 1;
//			}
//		}
//		if (kt10 == 1) {
//			System.out.print("Phan tu thu 2 va phan tu cuoi cung trong mang co doi xung ");
//		}else {
//			System.out.print("Phan tu thu 2 va phan tu cuoi cung trong mang khong doi xung");
//		}

//		11. Tìm chỉ số của phần tử lẻ đầu tiên(viết hàm)
//		for (int i = 0; i < list.size(); i++) { // 6 3 8 5
//			if (list.get(i) % 2 != 0) {
//				System.out.print("Phan tu le dau tien la " + list.get(i) + " tai vi tri " + i);
//				break;   //break dung vong lap
//			}
//		}

//		12. kiểm tra xem các phần tử trong mảng là các số lẻ hay chẵn(viết hàm)
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) % 2 == 0) {
//				System.out.println("Phan tu chan la " + list.get(i));
//			} else if (list.get(i) % 2 != 0) {
//				System.out.println("Phan tu le la " + list.get(i));
//			}
//		}
		
//		System.out.print("So chan ");
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)%2==0) {
//				System.out.print(list.get(i)+" ");
//			}
//		}
//		System.out.println(" " );
//		System.out.print("So le ");
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)%2!=0) {
//				System.out.print(list.get(i)+" ");
//			}
//		}
//		13. Các phần tử trong mảng có đối xứng hay không(viết hàm)
//		int kt13=0;
//		for(int i=0;i<list.size();i++) {            // 1 3 5 5 3 1     //1 2 3 4
//			if(list.get(i)==list.get(n-1-i)) {
//				kt13=1;
//			}
//		}
//		if(kt13==0) {
//			System.out.println("Mang khong doi xung");
//		}else if(kt13==1) {
//			System.out.println("Mang  doi xung");
//		}

//		16.thêm 1 phần tử không trùng lặp
//		(Sửa dụng Arraylist, map,set
		int kt16 = 0;
		System.out.println("Nhap phan tu muon them");
		int them16 = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != them16) {
				kt16 = 1;
				list.add(scanner.nextInt());
				System.out.println(list.get(i));
			}
		}

	}

	}


