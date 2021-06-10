package folder1;

import java.util.Scanner;

public class Bab7No5 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        int[] a = new int[10];
        
        System.out.print("Masukkan 10 bilangan bulat : ");
        
        for (int i = 0; i < 10; i++) {
            a[i] = bacaInput.nextInt();
        }
        
        int[] b = new int[10];
        int index_b = 0;
        
        for (int i : a) {
            boolean cek = apakahAda(b, i);
            if (!cek) {
                b[index_b] = i;
                index_b++;
            }
        }
        
        System.out.println("Bilangan yang berbeda ada sebanyak " + index_b);
        
        System.out.print("Bilangannya adalah ");
        for (int i : b) {
            if (i == 0) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static boolean apakahAda(int[] b, int n) {
        boolean hasil = false;
        
        for (int i : b) {
            if (i == n) {
                hasil = true;
                break;
            }
        }
        
        return hasil;
    }
    
}