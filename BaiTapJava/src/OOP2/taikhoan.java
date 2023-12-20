package OOP2;

public class taikhoan {
//	tạo 1 class Tài Khoản gồm các thuộc tính:
//		Số tài khoản:int
//		Họ Tên:String
//		Số Tiền: double
//		Mật khẩu:String
//		Câu hỏi:
//		1 nhập n tài khoản, in ra các tài khoản
//		2 sửa thông tin của 1 tài khoản
//		3. xóa thông tin của 1 tài khoản
//		4. tìm số tiền lớn nhất, và in ra tài khoản đó làn tài khoản nào

	int stk;
	String hoten;
	Double sotien;
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
	public Double getSotien() {
		return sotien;
	}
	public void setSotien(Double sotien) {
		this.sotien = sotien;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public taikhoan(int stk, String hoten, Double sotien, String mk) {
		super();
		this.stk = stk;
		this.hoten = hoten;
		this.sotien = sotien;
		this.mk = mk;
	}

}
