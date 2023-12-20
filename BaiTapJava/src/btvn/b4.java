package btvn;

import java.util.Scanner;

public class b4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        
        int dem = 0; 
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
               dem = dem + 1;
            }
        }
        
        System.out.println(dem);
    }
}

