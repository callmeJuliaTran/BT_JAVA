package btvn;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Viết chương trình từ 1 đến 10 có bao nhiêu số chia hết cho 3
		int dem =0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				dem = dem + 1;
				
			}
		}System.out.print(dem);
	}

}
