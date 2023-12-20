package Ham;

import java.util.Scanner;

public class b15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//viết chương trình tính tổng n số chẵn đầu tiên

		Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n");
int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			if()
//			System.out.print(i + " ");
//
//		}

		int gh = tong(n);
		System.out.print(gh);
	}

	public static int tong(int n) {
		int sum = 0;
		int a = 1;

		for (int i = 1; i <= n;) {
			if (a % 2 == 0) {
				sum = sum + a;
				i++;
			}
			a++;
		}
		return sum;
	}
}
