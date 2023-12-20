package Test_OOP;

public class ChitietTK extends TAIKHOAN{
	public ChitietTK(int stk, String hoten, double sotien, String mk) {
		super(stk, hoten, sotien, mk);
		// TODO Auto-generated constructor stub
	}
	public ChitietTK(int stk, String hoten, double sotien, String mk, String ngayruttien, double tienrut) {
		super(stk, hoten, sotien, mk);
		this.ngayruttien = ngayruttien;
		this.tienrut = tienrut;
	}
	public String getNgayruttien() {
		return ngayruttien;
	}
	public void setNgayruttien(String ngayruttien) {
		this.ngayruttien = ngayruttien;
	}
	public double getTienrut() {
		return tienrut;
	}
	public void setTienrut(double tienrut) {
		this.tienrut = tienrut;
	}
	String ngayruttien;
	double tienrut;
}
