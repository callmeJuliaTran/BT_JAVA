package thuchanh;

import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tong = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				if (arr[i] > 0 && arr[i] % 2 != 0) {
					tong = tong + arr[i];
				}
			}System.out.print(tong);
		}
	}
		

	}


