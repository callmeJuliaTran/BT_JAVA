package btvn;

import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình hiển thị các số lớn hơn 5, dãy số từ 1 đến n
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i > 5) {
				System.out.print(i + " ");
			}
		}
	}

}
