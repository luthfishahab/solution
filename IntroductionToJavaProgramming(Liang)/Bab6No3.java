package folder1;

import java.util.Scanner;

public class Bab6No3 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        int n = bacaInput.nextInt();
        
        boolean palindrom = isPalindrome(n);
        
        if (palindrom) {
            System.out.println(n + " adalah bilangan palindrom");
        }
        else {
            System.out.println(n + " bukan bilangan palindrom");
        }
    }
    
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int n) {
        int sisa_bagi = n%10;
        int hasil_bagi = n/10;
        int n_baru = sisa_bagi;
        
        while(hasil_bagi > 0) {
            n = hasil_bagi;
            sisa_bagi = n%10;
            hasil_bagi = n/10;
            n_baru = 10*n_baru + sisa_bagi;
        }
        
        return n_baru;
    }
    
    // Return true if number is a palindrome
    public static boolean isPalindrome(int n) {
        int n_baru = reverse(n);
        boolean hasil = false;
        
        if (n == n_baru) {
            hasil = true;
        }
        
        return hasil;
    }
    
}