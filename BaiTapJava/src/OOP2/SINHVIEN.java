package OOP2;

public class SINHVIEN {
//	Viết chương trình quản lý sinh viên, gồm mã sinh viên tên, tuổi, mã lớp,điểm trung bình
//	1.Nhập n sinh viên và in ra màng hình 
//	2. Hiển thị các sinh viên lớn hơn 20 và bé hơn 25
//	3.Hiển thị sinh viên có điểm trung bình cao nhất
//	4, Hiển thị các sinh viên có điểm =8
	
	String maSV;
	int tuoiSV;
	String lopSV;
	double dtbSV;
	String tenSV;
	public SINHVIEN(String tenSV) {
		super();
		this.tenSV = tenSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public SINHVIEN(String maSV, int tuoiSV, String lopSV, double dtbSV, String tenSV) {
		super();
		this.maSV = maSV;
		this.tuoiSV = tuoiSV;
		this.lopSV = lopSV;
		this.dtbSV = dtbSV;
		this.tenSV = tenSV;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public int getTuoiSV() {
		return tuoiSV;
	}
	public void setTuoiSV(int tuoiSV) {
		this.tuoiSV = tuoiSV;
	}
	public String getLopSV() {
		return lopSV;
	}
	public void setLopSV(String lopSV) {
		this.lopSV = lopSV;
	}
	public double getDtbSV() {
		return dtbSV;
	}
	public void setDtbSV(double dtbSV) {
		this.dtbSV = dtbSV;
	}

	}
	

