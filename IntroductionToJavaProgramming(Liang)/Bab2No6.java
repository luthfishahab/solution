package folder1;

import java.util.Scanner;

public class Bab2No6 {

    public static void main(String[] args) {
        
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat antara 0 sampai 1000 : ");
        
        int a = bacaInput.nextInt();
        int b = a % 10;
        int c = a / 10;
        int jumlah = b;
        
        a = c;
        b = a % 10;
        c = a / 10;
        jumlah += b;
        
        a = c;
        b = a % 10;
        c = a / 10;
        jumlah += b;
        
        System.out.println("Jumlah digitnya adalah " + jumlah);
    }
    
}