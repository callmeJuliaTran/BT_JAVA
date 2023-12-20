package OOP2;

public class GA_MEO {

	//tạo lớp cha gồm thuộc tính, tên,tuôi
	//tạo lớp con mèo kế thừa từ lớp cha
	//tạo lớp con gà kế thừa từ lớp cha và thêm thuộc tính là màu sắt
	//Viết chương trình in ra 1 con gà, và in ra 1 con mèo
	
	String ten;
	int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public GA_MEO(String ten, int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	
}
