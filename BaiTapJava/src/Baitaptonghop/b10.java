package Baitaptonghop;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

public class b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//. Viết chương trình mảng gồm 5 phần tử, đếm xem có bao nhiêu phần tử chia hết 
		// cho 3, và kiểm tra xem tổng các phần tử chia hết cho 3 có lớn hơn 20 hay
		// không
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}

		int dem = 0;
		int tong = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 3 == 0) {
				tong = tong + list.get(i);
				dem = dem + 1;
			}

		}
		System.out.print("co " + dem + " pt chia het cho 3 va tong = " + tong);

		if (tong > 20) {
			System.out.print("  tong cac pt lon hon 20");
		} else {
			System.out.print("  tong k lon hon 20");
		}

	}
}
