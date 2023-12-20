package btvn;
import java.util.Scanner;
public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình tính giai thừa của 1 số
		int gt=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			gt= gt*i;
		}System.out.print(gt);
	}

}
