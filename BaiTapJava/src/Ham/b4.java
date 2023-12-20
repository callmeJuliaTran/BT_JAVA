package Ham;

public class b4 {

	public static void main(String[] args) {
		int gh = tong(4);
		System.out.print(gh);
		// TODO Auto-generated method stub
//Viết chương trình tính tổng các số lớn hơn 3 và bé hơn 10 dãy số từ 2 đến n

	}

	public static int tong(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (i > 3 && i < 10) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
