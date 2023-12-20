package Ham;

import java.util.Scanner;

public class b21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//so hoan hao
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ");
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				tong = tong + i;
			}
		}
		if (n == tong) {
			System.out.print("n la so hoan hao");
		} else {
			System.out.print("n k la so hoan hao");
		}
	}

}
