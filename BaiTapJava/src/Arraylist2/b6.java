package Arraylist2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình mảng gồm n phần tử, tìm khoản cách max và min khoản cách =
		// max- min
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu");
			set.add(scanner.nextInt());
		}

		int goimax = max(set);
		int goimin = min(set);

		System.out.println(goimax);
		System.out.println(goimin);
		System.out.print("Khoang cach " + (goimax - goimin));
	}

	public static int max(Set<Integer> set) {
		int max = 0;
		for (Integer i : set) {
			if (i > max) {
				max = i;
			}
		}
		return max;

	}

	public static int min(Set<Integer> set) {
		int min = 0; // 123
		for (Integer i : set) {
			min = i;
			break;
		}
		for (Integer j : set) {
			if (min > j) {
				min = j;
			}
		}
		return min;

	}
}
