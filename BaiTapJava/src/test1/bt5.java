package test1;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

import OOP2.taikhoan;
import sun.util.resources.ext.CalendarData_sr_Latn_RS;

public class bt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6.Tìm phần tử lớn thứ 2 trong mảng, mảng gồm n phần tử
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		int [] arr= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= scanner.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {   // 3 5 2 6
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]> arr[i]) {
					int t = arr[i];//3
					arr[i]= arr[j];//5
					arr[j]=t;	
				}
			}
		}System.out.print(arr[1]);
		
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {   // 4 6 3 7
//				if(arr[i]>arr[j]) {
//					int t= arr[j];
//					arr[j]=arr[i];
//					arr[i]=t;
//					
//				}
//			}System.out.print(arr[i]+" ");
//		}
		
		
	}

}
