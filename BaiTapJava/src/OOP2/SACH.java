package OOP2;

public class SACH extends TAILIEU {
//	2. Xây dựng lớp Sách mô tả thông tin về tài liệu sách, lớp kế thừa từ lớp Tài liệu và bổ sung thêm các thuộc tính: tên tác giả, đơn giá, năm xuất bản
//	- Nhập dữ liệu cho các thuộc tính.(nhập n Sách)
//	- Viết chương trình thiết lập và lấy thông tin của các thuộc tính;
	
	String tacgia ;
	int gia;
	public SACH(String maTL, String tenTL, int sotrang, String tacgia, int gia, int namxuatban) {
		super(maTL, tenTL, sotrang);
		this.tacgia = tacgia;
		this.gia = gia;
		this.namxuatban = namxuatban;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getNamxuatban() {
		return namxuatban;
	}
	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}
	int namxuatban;
}
