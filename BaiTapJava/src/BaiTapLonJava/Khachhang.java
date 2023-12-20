package BaiTapLonJava;

public class Khachhang {
//	Để Furama vào hoạt động được thì mình phải xây dựng khu nghỉ dưỡng. Ban đầu mình xây dựng Furama 
//	có 5 cái Villa , 2 cái House và 1 hồ bơi. Một cái Villa thì có 1 cái giường . Nếu Khách có thuê cái Villa thì 
//	phải trả tiền 1 ngày là 10 USD. Một cái House thì có 4 cái giường. Nếu khách thuê 1 ngày thì trả 5 USD. 
//	Hồ bơi thì mở cửa lúc 10 sáng hằng ngày
//	Task 2: Tạo cấu trúc dự án và tạo các class (dựa vào danh từ cho ra class) cần thiết Giả sử có 1 khách 
//	hàng tên Nguyễn Văn A , 20 tuổi thuê 1 cái Villa trong 4 ngày, tính tiền cho khách hàng Nguyễn Văn A. In 
//	kết quả ra màn hình Hiển thị tên , tuổi của KH ra màn hình
//	Task 3 : Tạo 1 class Swimming hiển thị giờ mở cửa của Swimming pool là mấy giờ. In kết quả ra màn hình 
//	Nếu khách hàng đến trước 8h thì thông báo Hồ bơi chưa mở cửa , bạn hãy chờ đến 9h (if/else) Viết một 
//	hàm tính xem nếu khách hàng có 100 USD thì in thông báo họ sẽ ở được mấy ngày trong villa , nếu có 50 
//	USD thì ở được mấy ngày. Nếu 30 thì ở được mấy ngày 
//	Task 4: Giả sử có 10 khách hàng đặt phòng .Sử dụng ArrayList để lưu 10 KH 
//	Task 1 hiển thị tất cả các Khách hàng có trong Resort
//	Yêu cầu các kỷ thuật sau phải được áp dụng ArrayList
	
	String tenKH;
	int tuoiKH;
	public Khachhang(String tenKH, int tuoiKH) {
		super();
		this.tenKH = tenKH;
		this.tuoiKH = tuoiKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getTuoiKH() {
		return tuoiKH;
	}
	public void setTuoiKH(int tuoiKH) {
		this.tuoiKH = tuoiKH;
	}
}
