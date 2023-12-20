package Project_ATM;

public class taikhoan {
//	Xây dựng một lớp biểu diễn tài khoản ngân hàng với 2 thành phần dữliệu là họtên và sốdư. 
//	0 Nhập n tài khoản
//	1 cho phép hiển thịhọtên và sốdư của tài khoản,
//	2 nạp tiền vào tài khoản,
//	3 rút tiền ra khỏi tài khoản
//
//	Khi nạp  tiền vào tài khoản thì  sốtiền nạp ít  nhất là 5000. Nếu nạp  sốtiền ít hơn 5000 
//	thì ra thông báo “Không nạp tiền”và sốdư không đổi.Khi rút tiền ra khỏi tài khoản 
//	thì sốtiền rút ít nhất là 2000 và sốdư tài khoản phải lớn hơn hoặc bằng sốtiền rút.
//	 Nếu không rút được thì ra thông báo “Không rút tiền”và sốdư không đổi.

	String ten;
	int mapin;
	int sodu;
	int quyen;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMapin() {
		return mapin;
	}
	public void setMapin(int mapin) {
		this.mapin = mapin;
	}
	public int getSodu() {
		return sodu;
	}
	public void setSodu(int sodu) {
		this.sodu = sodu;
	}
	public int getQuyen() {
		return quyen;
	}
	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}
	public taikhoan(String ten, int mapin, int sodu, int quyen) {
		super();
		this.ten = ten;
		this.mapin = mapin;
		this.sodu = sodu;
		this.quyen = quyen;
	}

}