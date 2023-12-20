package btvn;

import java.util.Scanner;

public class b3 {

	   public static void main(String[] args)	{	// TODO Auto-generated method stub
//Viết chương trình tính 1^2+2^2+3^2+..+n^2

		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập n: ");
	   int  n= sc.nextInt();
		int tong = 0;
		
		for(int i = 1;i<=n;i++ ) {
			tong = tong + i*i;
		}System.out.print(tong);
	}

}
