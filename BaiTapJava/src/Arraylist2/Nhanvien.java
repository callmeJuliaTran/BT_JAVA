package Arraylist2;

public class Nhanvien {
//	Task 1 .Gỉa sử có n nhân viên gồm tên tuổi,mã nhân viên,
	//lương,
	//in ra n nhân viên đó
	//1 tìm tên nhân viên, và in thông tin nhân 
//	viên đó ra màng hình
//	Task 2.xóa 1 nhân viên có trong mảng
//	Task 3.Tìm tuổi của nhân viên lớn nhất
	
	String ten;
	public Nhanvien(String ten, int tuoi, String ma, int luong) {
	super();
	this.ten = ten;
	this.tuoi = tuoi;
	this.ma = ma;
	this.luong = luong;
}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	int tuoi;
	String ma;
	int luong;
}
