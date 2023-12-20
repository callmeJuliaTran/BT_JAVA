package Baitaptonghop;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import sun.security.x509.X509CRLImpl.TBSCertList;

public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình mảng gồm n phần tử, tính trung bình cộng của các phần tử

		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so luong pt");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap pt");
			list.add(scanner.nextInt());
		}

		int tong = 0;
		int dem = 0;
		for (int i = 0; i < list.size(); i++) {
			tong = tong + list.get(i);
			dem = dem + 1;

		}
		System.out.print("tbc = " + tong / dem);

	}

}
