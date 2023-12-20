package Ham;

public class b6 {

	public static void main(String[] args) {
		int gh = tong(3);
				System.out.print(gh);
		// TODO Auto-generated method stub
//Viết chương trình tính 1^2+2^2+...+n^2, viết hàm
	}

	public static int tong(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		return sum;
	}
}
