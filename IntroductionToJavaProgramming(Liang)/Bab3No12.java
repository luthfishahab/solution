package folder1;

import java.util.Scanner;

public class Bab3No12 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan tiga digit : ");
        int a = bacaInput.nextInt();
        
        int ratusan = a / 100;
        int satuan = a % 10;
        
        if (ratusan == satuan) {
            System.out.println(a + " adalah bilangan palindrom");
        }
        else {
            System.out.println(a + " bukan bilangan palindrom");
        }
        
        
    }
    
}
