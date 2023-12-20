package Test_OOP;

public class TAIKHOAN {
	int stk;
	String hoten;
	double sotien;
	String mk;
	public int getStk() {
		return stk;
	}
	public void setStk(int stk) {
		this.stk = stk;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getSotien() {
		return sotien;
	}
	public TAIKHOAN(int stk, String hoten, double sotien, String mk) {
		super();
		this.stk = stk;
		this.hoten = hoten;
		this.sotien = sotien;
		this.mk = mk;
	}
	public void setSotien(double sotien) {
		this.sotien = sotien;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
}
