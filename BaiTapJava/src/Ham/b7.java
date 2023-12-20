package Ham;

public class b7 {

	public static void main(String[] args) {
		float gh = tong(3);
		System.out.print(Math.floor(gh*1000)/1000);
		// TODO Auto-generated method stub
//1/1+1/2+1/3+...1/n

	}

	public static float tong(int n) {
		float sum = 0;
		for (float i = 1; i <= n; i++) {
			sum = sum + 1 / i;
		}
		return sum;
	}
}
