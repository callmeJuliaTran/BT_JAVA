package Map;

public class Thue {
//	 Nhập vào tên sản phẩm, số lượng và đơn giá. Tính tiền thuế giá trị gia tăng phải trả, biết rằng: 
//		 Tiền = số lượng * đơn giá
//		 Thuế giá trị gia tăng = 10% * tiền
//		 2. Tạo lớp SanPham gồm 4 thuộc tính: tên, giá , giảm giá, năm sản xuất. Lớp cũng gồm 1 phương thức là tính thuế nhập khẩu (13% giá nhập khẩu).
//		            Thông tin xuất ra màn hình gồm:
//		 o	Tên sản phẩm
//		 o	Đơn giá
//		 o	Giảm giá
//		 o	Năm sản xuất
//		 o	Thuế nhập khẩu

	String ten;
	int soluong;
	int gia;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public Thue(String ten, int soluong, int gia) {
		super();
		this.ten = ten;
		this.soluong = soluong;
		this.gia = gia;
	}
}
