package folder1;

import java.util.Scanner;

public class Bab5No16 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat : ");
        int a = bacaInput.nextInt();
        
        while (a > 1) {
            for (int i = 2; i <= a; i++) {
                if (a%i == 0) {
                    System.out.print(i + " ");
                    a = a/i;
                    break;
                }
            }
        }
        System.out.println();
    }
    
}