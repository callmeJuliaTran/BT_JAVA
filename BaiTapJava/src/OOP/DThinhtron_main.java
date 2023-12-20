package OOP;

import if_else.vidu1;

public class DThinhtron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cú pháp : <class_name><object_name> = new<class_name>();
		DThinhtron aDThinhtron = new DThinhtron(3.14, 4);
		double dt = aDThinhtron.getBankinh()*aDThinhtron.getBankinh()*aDThinhtron.getPi();
		System.out.println("Dien Tinh = " + dt);
		
		double cv = aDThinhtron.getBankinh()*aDThinhtron.getPi()*2;
		System.out.println("Chu Vi = "+ cv);
	}

}
