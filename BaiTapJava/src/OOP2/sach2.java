package OOP2;

public class sach2 {
//	Xây dựng lớp Sách mô tả thông tin về sach gồm mã sách, tên sách, tên tác giả, năm xuất bản
//	1 Nhập dữ liệu cho các thuộc tính.(nhập n Sách)
//	2. Hiển thị các quyển  sách có năm xuất bản lớn hơn 1991
//	3. Tìm quyển sách có năm xuất bản nhỏ nhất
//	4. đếm xem có bao nhiêu quyển sách có năm xuất bản lớn hơn 1991
//	5.Tìm 1 quyển sách dựa vào mã sách
	
	String maSach ;
	String tenSach;
	String tenTacgia;
	int nam;
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTenTacgia() {
		return tenTacgia;
	}
	public void setTenTacgia(String tenTacgia) {
		this.tenTacgia = tenTacgia;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public sach2(String maSach, String tenSach, String tenTacgia, int nam) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tenTacgia = tenTacgia;
		this.nam = nam;
	}
	
	
}

