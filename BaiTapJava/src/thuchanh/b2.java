package thuchanh;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = scanner.nextInt();
		System.out.print("Nhap k");
		int k = scanner.nextInt();

		long gh = numberOfCombinations(n, k);
		System.out.print(gh);
	}

	public static long numberOfCombinations(int n, int k) {
		long gt1 = 1;
		long gt2 = 1;
		long gt3 = 1;
		long result;
		for (int i = 1; i <= n; i++) {
			gt1 = i * gt1;
		}
		for (int j = 1; j <= k; j++) {
			gt2 = j * gt2;
		}
		int hieu = n - k;
		for (int i = 1; i <= hieu; i++) {
			gt3 = i * gt3;
		}
		result = gt1 / (gt2 * gt3);
		return result;
	}
}
