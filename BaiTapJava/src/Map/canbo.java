package Map;

public class canbo {

//	Xây dựng lớp Canbo mô tả thông tin về cán bộ, bao gồm các thuộc tính: Mã cán bộ,
//	họ tên, giới tính (nam hoặc nữ). Viết các phương thức cho lớp Canbo bao gồm:
//	- Nhập dữ liệu cho các thuộc tính.(nhập 5 cán bộ)
//	- Hiển thị thông tin của cán bộ
//	- Trả về giá trị  thuộc tính họ tên của cán bộ
//
//
//	Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//	từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//	. Viết các phương thức cho lớp Congnhan bao gồm:
//	- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//	- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền
//	lương. Biết rằng: Tiền lương = số ngày làm việc * tiền công nhật. Trong đó tiền công nhật
//	= 400000/ngày đối với bậc là 1, 450000/ngày đối với bậc 2 và 500000/ngày đối với bậc 3
	
	String ma;
	public canbo(String ma, String ten, String gt) {
	super();
	this.ma = ma;
	this.ten = ten;
	this.gt = gt;
}
	String ten;
	String gt;
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
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		this.gt = gt;
	}
}
