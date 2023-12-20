package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class GA_MEO_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tạo lớp cha gồm thuộc tính, tên,tuôi
		// tạo lớp con mèo kế thừa từ lớp cha
		// tạo lớp con gà kế thừa từ lớp cha và thêm thuộc tính là màu sắt
		// Viết chương trình in ra 1 con gà, và in ra 1 con mèo

		Scanner scanner = new Scanner(System.in);

		ArrayList<GA> list = new ArrayList<>();
		System.out.print("Nhap so luong con ga");
		int ga = scanner.nextInt();
		for (int i = 0; i < ga; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten cho ga");
			String tenGA = scanner.nextLine();
			System.out.print("Nhap tuoi cho ga");
			int tuoiGA = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap mau cho ga");
			String mauGA = scanner.nextLine();
			list.add(new GA(tenGA, tuoiGA, mauGA));
		} 

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTen() + " " + list.get(i).getTuoi() + " " + list.get(i).getMau());
		}
		ArrayList<MEO> list2 = new ArrayList<>();
		System.out.print("Nhap so luong con meo");
		int meo = scanner.nextInt();
		for (int i = 0; i < meo; i++) {
			scanner.nextLine();
			System.out.print("Nhap ten cho meo");
			String tenMeo = scanner.nextLine();
			System.out.print("Nhap tuoi cho meo");
			int tuoiMeo = scanner.nextInt();
			list2.add(new MEO(tenMeo,tuoiMeo));

	}
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getTen()+" "+ list.get(i).getTuoi());
		}

	}
}
