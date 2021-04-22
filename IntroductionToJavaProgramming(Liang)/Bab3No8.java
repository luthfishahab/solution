package folder1;

import java.util.Scanner;

public class Bab3No8 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukkan tiga integer : ");
        
        int a = bacaInput.nextInt();
        int b = bacaInput.nextInt();
        int c = bacaInput.nextInt();
        
        if (a < b) {
            if (b < c) {
                System.out.println("Barisan terurut : " + a + ", " + b + ", " + c);
            }
            else if (a < c) {
                System.out.println("Barisan terurut : " + a + ", " + c + ", " + b);
            }
            else {
                System.out.println("Barisan terurut : " + c + ", " + a + ", " + b);
            }
        }
        else {
            if (a < c) {
                System.out.println("Barisan terurut : " + b + ", " + a + ", " + c);
            }
            else if (b < c) {
                System.out.println("Barisan terurut : " + b + ", " + c + ", " + a);
            }
            else {
                System.out.println("Barisan terurut : " + c + ", " + b + ", " + a);
            }
        }
        
    }
    
}