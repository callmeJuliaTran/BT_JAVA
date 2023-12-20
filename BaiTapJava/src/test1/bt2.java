package test1;

import java.util.Scanner;

import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Tìm phần tử lớn nhất
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}		
		}System.out.print(max);

//		3. Đếm xem phần tử lớn nhất trong mảng có mấy phần tử
//		4.Kiểm tra xem phần tử có trong mảng hay không
//		5. Tìm chỉ số của phần tử nhỏ nhất
//		6.Tìm phần tử lớn thứ 2 trong mảng, mảng gồm n phần tử	

	}

}
