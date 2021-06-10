package folder1;

import java.util.Scanner;

public class Bab7No3 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        int[] a = new int[100];
        
        System.out.print("Enter the integers between 1 and 100 : ");
        
        int i = 0;
        
        a[i] = bacaInput.nextInt();
        i++;
        
        while (a[i-1] != 0) {
            a[i] = bacaInput.nextInt();
            i++;
        }
        
        for (int j = 1; j <= 100; j++) {
            int muncul = 0;
            for (int k : a) {
                if (j == k) {
                    muncul++;
                }
            }
            if (muncul == 1) {
                System.out.println(j + " occurs " + muncul + " time");
            }
            else if (muncul >= 2) {
                System.out.println(j + " occurs " + muncul + " times");
            }
            
        }
        
    }
    
}