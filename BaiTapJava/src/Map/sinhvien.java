package Map;

import com.sun.beans.decoder.StringElementHandler;

public class sinhvien {
	//tạo 1 class sinh viên gồm mã sinh viên, tên,tuổi,điểm trung bình
	//mã sinh viên k được trùng lặp
	//nhập n sinh viên và in ra sinh viên có trong map
	String msv;
	String ten;
	int tuoi;
	int dtb;
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
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
	public int getDtb() {
		return dtb;
	}
	public void setDtb(int dtb) {
		this.dtb = dtb;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dtb;
		result = prime * result + ((msv == null) ? 0 : msv.hashCode());
		result = prime * result + ((ten == null) ? 0 : ten.hashCode());
		result = prime * result + tuoi;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhvien other = (sinhvien) obj;
		if (dtb != other.dtb)
			return false;
		if (msv == null) {
			if (other.msv != null)
				return false;
		} else if (!msv.equals(other.msv))
			return false;
		if (ten == null) {
			if (other.ten != null)
				return false;
		} else if (!ten.equals(other.ten))
			return false;
		if (tuoi != other.tuoi)
			return false;
		return true;
	}
	public sinhvien(String msv, String ten, int tuoi, int dtb) {
		super();
		this.msv = msv;
		this.ten = ten;
		this.tuoi = tuoi;
		this.dtb = dtb;
	}
	
}
