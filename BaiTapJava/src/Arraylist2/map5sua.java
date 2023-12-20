package Arraylist2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map5sua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //sửa 1 value trong map, dựa vào key của value
		Scanner scanner = new Scanner(System.in); // key k trung value dc trung
		Map<Integer, Integer> map = new HashMap<>();
		System.out.print("Nhap so luong trong map");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap key");
			int key = scanner.nextInt();
			System.out.print("Nhap value");
			int value = scanner.nextInt();
			map.put(key, value);
		}
		Set<Integer> set = map.keySet();  //lay tat ca key tren map luu vao set
		System.out.print("Nhap key can sua");
		int keysua = scanner.nextInt();
		int kt=0;
		for(Integer change:set) {
			if(keysua==change) {
				kt=1;
				System.out.print("Sua thanh");
				map.put(keysua,scanner.nextInt());
			}
		}
		if(kt==1) {
			for(Integer i:set) {
				System.out.print(map.get(i)+" ");
			}
		}else {
			System.out.print("key can tim k ton tai");
		}
	}

}
