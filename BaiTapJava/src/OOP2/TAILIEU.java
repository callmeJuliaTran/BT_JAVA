package OOP2;

public class TAILIEU {
//1. Xây dựng lớp Tài Liệu mô tả thông tin về tài liệu gồm các thuộc tính mã tài liệu, tên tài liệu, số trang.
	
	String maTL ;
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
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	public TAILIEU(String maTL, String tenTL, int sotrang) {
		super();
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.sotrang = sotrang;
	}
	
	
}
