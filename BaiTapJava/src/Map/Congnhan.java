package Map;

public class Congnhan extends canbo {
//	Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//	từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//	. Viết các phương thức cho lớp Congnhan bao gồm:
//	- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//	- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền
//	lương. Biết rằng: Tiền lương = số ngày làm việc * tiền công nhật. Trong đó tiền công nhật
//	= 400000/ngày đối với bậc là 1, 450000/ngày đối với bậc 2 và 500000/ngày đối với bậc 3

	int bac;
	int ngaylamviec;
	int luong;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public int getNgaylamviec() {
		return ngaylamviec;
	}

	public void setNgaylamviec(int ngaylamviec) {
		this.ngaylamviec = ngaylamviec;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public Congnhan(String ma, String ten, String gt, int bac, int ngaylamviec, int luong) {
		super(ma, ten, gt);
		this.bac = bac;
		this.ngaylamviec = ngaylamviec;
		this.luong = luong;
	}

}
