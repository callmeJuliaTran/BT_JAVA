package BaiTapLon_SET;

public class TaiKhoan {
	//Quản lý hệ thống, để quản lý hệ thống cần 1 class gồm tên tài khoản, Mật khẩu
	String tk;
	String mk;
	public TaiKhoan(String tk, String mk) {
		super();
		this.tk = tk;
		this.mk = mk;
	}
	public String getTk() {
		return tk;
	}
	public void setTk(String tk) {
		this.tk = tk;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
}
