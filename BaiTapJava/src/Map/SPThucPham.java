package Map;

import java.sql.Date;

public class SPThucPham extends Sanpham {

//	tạo  lớp SanPham với các thuộc tính và phương thức cơ bản.
//	tenSanPham
//	 lớp con là SanPhamThucPham và SanPhamDienTu để kế thừa từ SanPham
//	Nếu hạn sử dụng còn hơn 20 ngày, giá bán được tính bằng giá nhập cộng thêm 10%.
//	Nếu hạn sử dụng ít hơn hoặc bằng 20 ngày, giá bán được tính bằng giá nhập cộng thêm 5%.
//	Gía bán điện tử không thay đổi
	String hsd ;
	public SPThucPham(String tensp, String masp, String hsd, int gianhap) {
	super(tensp, masp);
	this.hsd = hsd;
	this.gianhap = gianhap;
}
	public String getHsd() {
		return hsd;
	}
	public void setHsd(String hsd) {
		this.hsd = hsd;
	}
	public int getGianhap() {
		return gianhap;
	}
	public void setGianhap(int gianhap) {
		this.gianhap = gianhap;
	}
	int gianhap;

	}

