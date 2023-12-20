package Mang;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình in ra các phần tử chẵn, mảng gồm 5 phần tử
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
