package Test_OOP;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class TAIKHOAN_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ChitietTK> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("So luong tai khoan can nhap");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {

			System.out.print("Nhap so tai khoan");
			int stk = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ho ten");
			String hoten = scanner.nextLine();
			System.out.print("Nhap so tien");
			double sotien = scanner.nextDouble();
			System.out.print("Nhap mat khau");
			String mk = scanner.nextLine();
			scanner.nextLine();
			System.out.print("Ngay rut tien");
			String ngayruttien = scanner.nextLine();
			System.out.print("so tien rut");
			double tienrut = scanner.nextDouble();
			list.add(new ChitietTK(stk, hoten, sotien, mk, ngayruttien, tienrut));

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getStk() + " " + list.get(i).getHoten() + " " + list.get(i).getSotien() + " "
					+ list.get(i).getMk() + " " + list.get(i).getNgayruttien() + " " + list.get(i).getTienrut());
		}
	}

}
