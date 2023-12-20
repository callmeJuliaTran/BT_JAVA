package OOP;

public class masinhvien {
// tạo 1 class sinh viên gồm mã sinh viên, tên,tuôi,
	//in ra 2 sinh viên
	
	String masinhvien;
	String ten;
	int tuoi;
	public String getMasinhvien() {
		return masinhvien;
	}
	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public masinhvien(String masinhvien, String ten, int tuoi) {
		super();
		this.masinhvien = masinhvien;
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	
}
