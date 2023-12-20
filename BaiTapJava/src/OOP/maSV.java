package OOP;

public class maSV {
//Viết chương trình tạo 1 class gồm các thuộc tính mã nhân viên,tên nhân viên,tuổi nhân viên
	//Nhập vào n nhân viên và in ra các nhân viên đó
	String maNV;
	String tenNV;
	int tuoiNV;
	public maSV(String maNV, String tenNV, int tuoiNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.tuoiNV = tuoiNV;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoiNV() {
		return tuoiNV;
	}
	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}
}
