package OOP2;

public class GA extends GA_MEO {
	
 public GA(String ten, int tuoi, String mau) {
		super(ten, tuoi);
		this.mau = mau;
	}

public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

String mau ;
}
