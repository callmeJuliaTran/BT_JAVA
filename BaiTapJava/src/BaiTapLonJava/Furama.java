package BaiTapLonJava;

public class Furama {
//	Để Furama vào hoạt động được thì mình phải xây dựng khu nghỉ dưỡng. Ban đầu mình xây dựng Furama 
//	có 5 cái Villa , 2 cái House và 1 hồ bơi. Một cái Villa thì có 1 cái giường . Nếu Khách có thuê cái Villa thì 
//	phải trả tiền 1 ngày là 10 USD. Một cái House thì có 4 cái giường. Nếu khách thuê 1 ngày thì trả 5 USD. 
//	Hồ bơi thì mở cửa lúc 10 sáng hằng ngày
//	Bộ phận nhân sự của Furama cần 1 cái tủ để đựng hồ sơ của nhân viên. Khi có nhân viên nào muốn tìm 
//	hồ sơ của mình thì bộ phận nhân sự sẽ lục trong tủ hồ sơ
//	Task 1 .Gỉa sử có 10 nhân viên gồm tên tuổi,mã nhân viên, lương, tìm tên nhân viên, và in thông tin nhân 
//	viên đó ra màng hình
//	Task 2.Sắp xếp giảm dần tuổi của nhân viên
//	Task 3.Tìm tuổi của nhân viên lớn nhất
//	Task 4.Thêm 1 nhân viên vào vị trí bất kì
//	Task 5. Xóa nhân viên theo mã nhân viên
//	Task 6.Hiểm thị các nhân viên có tiền lương lớn thứ 2
	
	public static String gettuoiNV;
	String tenNV;
	int tuoiNV;
	String maNV;
	int luongNV;
	public Furama(String tenNV, int tuoiNV, String maNV, int luongNV) {
		super();
		this.tenNV = tenNV;
		this.tuoiNV = tuoiNV;
		this.maNV = maNV;
		this.luongNV = luongNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoiNV() {
		return tuoiNV;
	}
	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public int getLuongNV() {
		return luongNV;
	}
	public void setLuongNV(int luongNV) {
		this.luongNV = luongNV;
	}
}
