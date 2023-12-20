package Map;

public class Sanpham {
//	tạo  lớp SanPham với các thuộc tính và phương thức cơ bản.
//	tenSanPham
//	 lớp con là SanPhamThucPham và SanPhamDienTu để kế thừa từ SanPham
//	Nếu hạn sử dụng còn hơn 20 ngày, giá bán được tính bằng giá nhập cộng thêm 10%.
//	Nếu hạn sử dụng ít hơn hoặc bằng 20 ngày, giá bán được tính bằng giá nhập cộng thêm 5%.
//	Gía bán điện tử không thay đổi
	String tensp;
	String masp;
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public Sanpham(String tensp, String masp) {
		super();
		this.tensp = tensp;
		this.masp = masp;
	}
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
}
