package thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] line1 = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P" };
		String[] line2 = { "A", "S", "D", "F", "G", "H", "J", "K", "L" };
		String[] line3 = { "Z", "X", "C", "V", "B", "N", "M" };
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		int kt = 1;
		for (int i = 0; i < words.length; i++) {
			String[] a = words[i].split("");
			System.out.print(Arrays.toString(a));
			for (int j = 0; j < a.length; j++) {
				if (Arrays.asList(a[j], a[0]).contains(line1) || Arrays.asList(a[j], a[0]).contains(line2)
						|| Arrays.asList(a[j], a[0]).contains(line3)) {
					kt = 1;
					System.out.print(a + " ");
				}
			}
		}
		if (kt == 0) {
			System.out.print("Nothing");
		}

	}

}
