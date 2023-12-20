package Map;

public class sp extends Thue {
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
	int giamgia;

	public int getGiamgia() {
		return giamgia;
	}

	public void setGiamgia(int giamgia) {
		this.giamgia = giamgia;
	}

	public int getNamsx() {
		return namsx;
	}

	public void setNamsx(int namsx) {
		this.namsx = namsx;
	}

	public int getThuenhapkhau() {
		return thuenhapkhau;
	}

	public void setThuenhapkhau(int thuenhapkhau) {
		this.thuenhapkhau = thuenhapkhau;
	}

	int namsx;
	int thuenhapkhau;

	public sp(String ten, int soluong, int gia, int giamgia, int namsx, int thuenhapkhau) {
		super(ten, soluong, gia);
		this.giamgia = giamgia;
		this.namsx = namsx;
		this.thuenhapkhau = thuenhapkhau;
	}

	

}
