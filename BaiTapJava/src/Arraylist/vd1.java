package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class vd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình mảng gồm  n phần tử, in ra các phần tử trong mảng
	ArrayList<Integer> list = new ArrayList<>();
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap n");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("nhap phan tu");
			list.add(scanner.nextInt());
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		
	}

}
