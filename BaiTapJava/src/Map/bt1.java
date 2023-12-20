package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.sun.java.swing.action.NextAction;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Viết chương trình tìm key của phần tử nhỏ nhất, và key nhỏ nhất có giá trị bằng bao nhiêu
//		


		Scanner scanner = new Scanner(System.in); 
		Map<Integer, Integer> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		int newvalue=0;
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			System.out.print("Nhap value");
			int value = scanner.nextInt();
			if(i==0) {
				newvalue=value;  // luu gia tri vaalue dau tien
			}
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();
//		long min = 1000000000;
//		for (Integer timmin : set) {
//			if (map.get(timmin) < min) {
//				min = map.get(timmin);
//			}
//		}
//		System.out.print(min); 
		int min=newvalue;      //cho min bang gia tri value dau tien
		for(Integer timmin:set ) {
			if(map.get(timmin)<min) {
				System.out.print(map.get(timmin));
			}
		}
		
	}
	
}
