package OOP2;

public class CONGNHAN extends CANBO {
//	Xây dựng lớp Congnhan mô tả thông tin về các công nhân, lớp Congnhan kế thừa
//	từ lớp Canbo và bổ sung thêm thuộc tính: Bậc (từ 1 đến 3), số ngày làm việc,Tiền lương
//	. Viết các phương thức cho lớp Congnhan bao gồm:
//	- Nhập dữ liệu cho các thuộc tính (Nhập 5)
//	- Hiển thị thông tin về cán bộ bao gồm mã cán bộ, họ tên, bậc, số ngày làm việc, tiền
	
	int bacCN;
	int ngaylamviecCN;
	int tienluongCN;
	public int getBacCN() {
		return bacCN;
	}
	public void setBacCN(int bacCN) {
		this.bacCN = bacCN;
	}
	public int getNgaylamviecCN() {
		return ngaylamviecCN;
	}
	public void setNgaylamviecCN(int ngaylamviecCN) {
		this.ngaylamviecCN = ngaylamviecCN;
	}
	public int getTienluongCN() {
		return tienluongCN;
	}
	public void setTienluongCN(int tienluongCN) {
		this.tienluongCN = tienluongCN;
	}
	public CONGNHAN(String maCB, String hotenCB, String gioitinhCB, int bacCN, int ngaylamviecCN, int tienluongCN) {
		super(maCB, hotenCB, gioitinhCB);
		this.bacCN = bacCN;
		this.ngaylamviecCN = ngaylamviecCN;
		this.tienluongCN = tienluongCN;
	}
	
}
