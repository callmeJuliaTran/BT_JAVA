package Ham;

public class b3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//	//	Viết chương trình tính tổng dãy số lẻ, dãy  số từ 1 đến n
		int gh = tong(5);
		System.out.print(gh);
	}

	public static int tong(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
