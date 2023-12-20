package BaiTapLon_MAP;

public class Taikhoan {
//	Task 1. Nhập vào 5 tài khoản.
//	Task2,Đăng nhập vào tài khoản, nếu tài khoản trùng với 1 trong 5 tài khoản trên thì hiểm thị thông tin 
//	đó ra, nếu không trùng báo đăng nhập thất bại
//	Task 3.Đổi mật khẩu
//	Task 4.Tìm thông tin của tài khoản, tìm kiếm theo tên tài khoản
	String tkString;
	String mkString;
	public String getTkString() {
		return tkString;
	}
	public void setTkString(String tkString) {
		this.tkString = tkString;
	}
	public Taikhoan(String tkString, String mkString) {
		super();
		this.tkString = tkString;
		this.mkString = mkString;
	}
	public String getMkString() {
		return mkString;
	}
	public void setMkString(String mkString) {
		this.mkString = mkString;
	}
}
