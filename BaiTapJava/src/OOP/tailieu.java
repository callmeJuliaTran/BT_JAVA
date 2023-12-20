package OOP;

public class tailieu {
//Xây dựng lớp Tài Liệu mô tả thông tin về tài liệu gồm các thuộc tính mã tài liệu, tên tài liệu, số trang.
//	- Nhập dữ liệu cho các thuộc tính.(nhập n Tài liệu)
//	- Viết chương trình lấy thông tin thuộc tính số trang
	String maTL;
	String tenTL;
	int sotrang;
	public String getMaTL() {
		return maTL;
	}
	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}
	public String getTenTL() {
		return tenTL;
	}
	public void setTenTL(String tenTL) {
		this.tenTL = tenTL;
	}
	public tailieu(String maTL, String tenTL, int sotrang) {
		super();
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.sotrang = sotrang;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
}
