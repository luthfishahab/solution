package folder1;

import java.util.Scanner;

public class Bab6No2 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        int a = bacaInput.nextInt();
        
        int jumlah_digit = sumDigits(a);
        System.out.println(jumlah_digit);
    }
    
    public static int sumDigits(int n) {
        int sisa_bagi = n%10;
        int hasil_bagi = n/10;
        int jumlah_digit = sisa_bagi;
        
        while(hasil_bagi > 0) {
            n = hasil_bagi;
            sisa_bagi = n%10;
            hasil_bagi = n/10;
            jumlah_digit += sisa_bagi;
        }
        
        return jumlah_digit;
    }
    
}