package Ham;

public class b5 {

	public static void main(String[] args) {
		int gh = tong(4);
		System.out.print(gh);
		// TODO Auto-generated method stub
//Viết chương trình tính tổng các sô chẵn dãy số từ 2-n
	}

	public static int tong(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
