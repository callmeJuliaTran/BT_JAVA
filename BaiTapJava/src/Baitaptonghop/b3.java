package Baitaptonghop;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cách tính tổng của các số lẻ từ 1 đến 50 bằng cách sử dụng vòng lặp for
		int tong = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				tong = tong + i;
			}
		}
		System.out.print(tong);
	}

}
