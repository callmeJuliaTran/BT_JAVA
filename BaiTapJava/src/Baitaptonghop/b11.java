package Baitaptonghop;

import java.util.ArrayList;
import java.util.Scanner;

public class b11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình từ 1 đến 20, số nào chia hết cho 5 thì in ra màng hình"chia hết 
//		cho 5", số nào chia hết cho 2 thì in ra"chia hết cho 2", số nào chia hết cho 2 và 5 
//		thì in ra "chia hết cho 2 và 5"

		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " chia het cho 5 ");
			} else if (i % 2 == 0) {
				System.out.print(i + " chia het cho 2 ");
			} else if (i % 2 == 0 && i % 5 == 0) {
				System.out.print(i + " chia het cho ca 2 va 5 ");
			}
		}
	}

}
