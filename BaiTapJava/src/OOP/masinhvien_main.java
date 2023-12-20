package OOP;

public class masinhvien_main {
	public static void main(String[] args) {
	masinhvien amasinhvien1 = new masinhvien("SV1 ","TRAN1 ", 20);
	masinhvien amasinhvien2 = new masinhvien("SV2 ", "TRAN2 ", 21);
	masinhvien amasinhvien3 = new masinhvien("SV3 ", "TRAN3 ", 22);
	System.out.println(amasinhvien1.getMasinhvien() + amasinhvien1.getTen() + amasinhvien1.getTuoi());
	System.out.println(amasinhvien2.getMasinhvien() + amasinhvien2.getTen() + amasinhvien2.getTuoi());
	System.out.println(amasinhvien3.getMasinhvien() + amasinhvien3.getTen() + amasinhvien3.getTuoi());
	
	}
	
}
