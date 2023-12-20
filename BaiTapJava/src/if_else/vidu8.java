package if_else;

public class vidu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tính tổng số lẻ dãy số 2 đến 10

		int tong = 0;
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0) {
				tong = tong + i;
			}
		}
		System.out.print(tong);

	}

}
