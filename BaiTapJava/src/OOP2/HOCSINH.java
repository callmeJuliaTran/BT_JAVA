package OOP2;

public class HOCSINH {
//	Tạo 1 class học sinh gồm mã học sinh, tên học sinh, điểm trung bình
//	1 nhập n học sinh và in ra các học sinh
//	2 hiển thị học sinh có điểm trung bình tổng cao nhất
//	3 tìm học sinh có điểm trung bình cao hơn 7
//	4. Đếm xem có bao nhiêu học sinh có tổng điểm hơn hơn 6 bé hơn 9
	String maHS;
	String tenHS;
	double DTB;
	public String getMaHS() {
		return maHS;
	}
	public void setMaHS(String maHS) {
		this.maHS = maHS;
	}
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public double getDTB() {
		return DTB;
	}
	public void setDTB(double dTB) {
		DTB = dTB;
	}
	public HOCSINH(String maHS, String tenHS, double dTB) {
		super();
		this.maHS = maHS;
		this.tenHS = tenHS;
		DTB = dTB;
	}
	
}
