package OOP2;

public class CANBO {
//	Xây dựng lớp Canbo mô tả thông tin về cán bộ, bao gồm các thuộc tính: Mã cán bộ,
//	họ tên, giới tính (nam hoặc nữ). Viết các phương thức cho lớp Canbo bao gồm:
//	- Nhập dữ liệu cho các thuộc tính.(nhập 5 cán bộ)
//	- Hiển thị thông tin của cán bộ
//	- Trả về giá trị  thuộc tính họ tên của cán bộ
//	Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//	từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//	. Viết các phương thức cho lớp Congnhan bao gồm:
//	- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//	- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền
	String maCB;
	String hotenCB;
	String gioitinhCB;
	public String getMaCB() {
		return maCB;
	}
	public CANBO(String maCB, String hotenCB, String gioitinhCB) {
		super();
		this.maCB = maCB;
		this.hotenCB = hotenCB;
		this.gioitinhCB = gioitinhCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public String getHotenCB() {
		return hotenCB;
	}
	public void setHotenCB(String hotenCB) {
		this.hotenCB = hotenCB;
	}
	public String getGioitinhCB() {
		return gioitinhCB;
	}
	public void setGioitinhCB(String gioitinhCB) {
		this.gioitinhCB = gioitinhCB;
	}
}
