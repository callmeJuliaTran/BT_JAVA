import java.util.Scanner;

public class TongNgayThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		String ngay = "03/07/2001";
//		for (int i = 0; i < ngay.length(); i++) {
//			if (Character.isDigit(ngay.charAt(i))) {
//				sum = sum + Character.getNumericValue(ngay.charAt(i));
//			}
//		}
//		System.out.print(sum);
//		int sum1=0;
//		String b = String.valueOf(sum);//ép kiểu số nguyên về String
//		for(int i=0;i<b.length();i++) {
//			if(Character.isDigit(b.charAt(i))) {
//				sum1=sum1+Character.getNumericValue(b.charAt(i));
//				System.out.print(sum1);	
//			}
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ngay thang nam sinh");
		String ngay = scanner.nextLine();
		int gh = congngay(ngay);
		if (gh >= 10) {
			String b = String.valueOf(gh);
			int gh2 = congngay(b);
			System.out.print(gh2);
		} else {
			System.out.print(gh);
		}

	}

	public static int congngay(String ngay) {
		int sum = 0;
		for (int i = 0; i < ngay.length(); i++) {
			if (Character.isDigit(ngay.charAt(i))) {
				sum = sum + Character.getNumericValue(ngay.charAt(i));
			}
		}
		return sum;
	}

}
