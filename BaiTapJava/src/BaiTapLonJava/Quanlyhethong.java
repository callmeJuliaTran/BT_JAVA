package BaiTapLonJava;

public class Quanlyhethong {
//	Quản lý hệ thống, để quản lý hệ thống cần 1 class gồm tên tài khoản, Mật khẩu
//	Task 1. Nhập vào 5 tài khoản.
//	Task2,Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin 
//	đó ra, nếu không trùng báo đăng nhập thất bại
//	Task 3.Đổi mật khẩu
//	Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản
	
	String tentk;
	String mk;
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk;
	}
	public Quanlyhethong(String tentk, String mk) {
		super();
		this.tentk = tentk;
		this.mk = mk;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
}
