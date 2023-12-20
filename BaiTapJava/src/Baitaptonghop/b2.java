package Baitaptonghop;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Làm thế nào để sử dụng vòng lặp for để duyệt qua một dãy số từ 1 đến 20 và in ra 
		// các số chia hết cho 3

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
