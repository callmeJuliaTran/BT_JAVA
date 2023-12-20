package if_else;

public class vidu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình giải phương trình bậc 1
//		Nếu a = 0 và b = 0: phương trình có vô số nghiệm.
//
//				Nếu a = 0 và b <0 hoặc a=0 va b> 0: phương trình vô nghiệm.
//
//				Nếu a <0 hoac a> 0: phương trình có nghiệm duy nhất x = -b : a.

		int a = 2;
		int b = 3;
		if (a == 0 && b == 0) {
			System.out.print("phương trình có vô số nghiệm");
		} else if (a == 0 && b < 0 || a == 0 && b > 0) {
			System.out.print(" phương trình vô nghiệm.");
		} else if (a < 0 || a > 0) {
			System.out.print("Phuong trinh co nghiem duy nhat x = -b : a = " + (-b) / a);

		}

	}

}
