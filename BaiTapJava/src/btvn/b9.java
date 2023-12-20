package btvn;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình kiểm tra xem tổng dãy dãy số từ 1 đến 10, tổng dãy số là số chẵn hay là số lẻ
		int tong = 0;
		for (int i = 1; i <= 10; i++) {
			tong = tong + i;

		}
		System.out.print(tong + "");

		if (tong % 2 == 0) {
			System.out.print("tong la so chan");
		} else {
			System.out.print("tong la so le");
		}
	}

}
