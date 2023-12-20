package OOP2;

public class khachhang {
//tạo 1 class quản lý khách hàng gồm các thuộc tính, mã khách hàng, tên, tuổi, quê quán
//	1 Nhập vào n khách hàng và in các khách hàng ra màng hình
//	2.Tìm tuổi khách hàng lớn nhất
//	3. Tìm tuổi khách hàng nhỏ nhấ
//	4.đếm xem có bao nhiêu khách hàng lớn hơn 22 tuổi
//	5. Tìm kiếm 1 khách hàng
	
	String maKH;
	String tenKH;
	int tuoiKH;
	String queKH;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getTuoiKH() {
		return tuoiKH;
	}
	public void setTuoiKH(int tuoiKH) {
		this.tuoiKH = tuoiKH;
	}
	public String getQueKH() {
		return queKH;
	}
	public void setQueKH(String queKH) {
		this.queKH = queKH;
	}
	public khachhang(String maKH, String tenKH, int tuoiKH, String queKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.tuoiKH = tuoiKH;
		this.queKH = queKH;
	}

}
