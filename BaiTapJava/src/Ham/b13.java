package Ham;

import java.util.Scanner;

public class b13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//tim max min

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap max");
		int max = sc.nextInt();
		System.out.print("Nhap min");
		int min = sc.nextInt();
		int gh = kc(max, min);
		System.out.print(gh);
	}

	public static int kc(int max, int min) {
		int tim = 0;
		tim = max - min;
		return tim;
	}
}
