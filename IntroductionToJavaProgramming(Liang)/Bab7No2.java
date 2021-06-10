package folder1;

import java.util.Scanner;

public class Bab7No2 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        int[] a = new int[10];
        
        System.out.print("Masukkan 10 bilangan bulat : ");
        
        for (int i = 0; i < 10; i++) {
            a[i] = bacaInput.nextInt();
        }
        
        reverse(a);
        
    }
    
    public static void reverse(int[] a) {
        for (int i = 9; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
    
}