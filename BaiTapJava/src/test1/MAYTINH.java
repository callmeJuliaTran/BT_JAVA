package test1;

public class MAYTINH {
//	Tạo 1 class máy tính gồm các thuộc tính, mã máy tính,tên,loại,năm sản xuất
//	1.Nhập n máy tính, và in tất cả máy tính có trong mảng
//	2.Sửa tên máy tính dựa vào mã máy tính
//	3.Xóa thông tin của một máy tính
//	4.Tìm kiếm một máy tính
	
 String ma;
 String ten;
 String loai;
 int nam;
 int gia;
public MAYTINH(int gia) {
	super();
	this.gia = gia;
}
public int getGia() {
	return gia;
}
public void setGia(int gia) {
	this.gia = gia;
}
public MAYTINH(String ma, String ten, String loai, int nam) {
	super();
	this.ma = ma;
	this.ten = ten;
	this.loai = loai;
	this.nam = nam;
}
public String getMa() {
	return ma;
}
public void setMa(String ma) {
	this.ma = ma;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public MAYTINH(String ma, String ten, String loai, int nam, int gia) {
	super();
	this.ma = ma;
	this.ten = ten;
	this.loai = loai;
	this.nam = nam;
	this.gia = gia;
}
public String getLoai() {
	return loai;
}
public void setLoai(String loai) {
	this.loai = loai;
}
public int getNam() {
	return nam;
}
public void setNam(int nam) {
	this.nam = nam;
}
 
	
	
	
}
