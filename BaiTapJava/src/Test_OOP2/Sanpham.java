package Test_OOP2;

public class Sanpham {
String tenSp;
int donGia;
int giamGia;
int namSX;
public Sanpham(String tenSp, int donGia, int giamGia, int namSX) {
	super();
	this.tenSp = tenSp;
	this.donGia = donGia;
	this.giamGia = giamGia;
	this.namSX = namSX;
}
public String getTenSp() {
	return tenSp;
}
public void setTenSp(String tenSp) {
	this.tenSp = tenSp;
}
public int getDonGia() {
	return donGia;
}
public void setDonGia(int donGia) {
	this.donGia = donGia;
}
public int getGiamGia() {
	return giamGia;
}
public void setGiamGia(int giamGia) {
	this.giamGia = giamGia;
}
public int getNamSX() {
	return namSX;
}
public void setNamSX(int namSX) {
	this.namSX = namSX;
}
}
