package BaiTapLonJava;

public class Furama_xe {
//	Hằng ngày có rất nhiều chuyến xe ra vào Furama. Chúng ta cần một nơi để lưu trữ số lần có mỗi chiếc xe 
//	du lich vào Furama. Ví dụ có 1 chiếc xe vào thì mình lưu lại bản số xem và cuối ngày mình xem có bao 
//	nhiêu xe đi vào Furama: Class xe gồm tên xe, biển số xe, loại xe 
//	Task 1 Tạo ArrayList để lưu trữ Khi có một xe vào thì add vào ArrayList Viết 1 hàm để duyệt qua các 
//	biển số xe trong ngày,
//	+Tính tổng số xe trong 1 ngày
//	+Tính tiền thu được. biết 1 xe/10.000đ
	
	String tenxe ;
	String bienso;
	String loaixe;
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public Furama_xe(String tenxe, String bienso, String loaixe) {
		super();
		this.tenxe = tenxe;
		this.bienso = bienso;
		this.loaixe = loaixe;
	}
	public String getBienso() {
		return bienso;
	}
	public void setBienso(String bienso) {
		this.bienso = bienso;
	}
	public String getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}
}
