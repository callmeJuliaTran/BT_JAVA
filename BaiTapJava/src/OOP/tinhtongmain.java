package OOP;

public class tinhtongmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cú pháp : <class_name><object_name> = new<class_name>();
		tinhtong bienTinhtong = new tinhtong(3, 4);
		int sum = bienTinhtong.getA() + bienTinhtong.getB();
		System.out.print(sum);
	}

}
