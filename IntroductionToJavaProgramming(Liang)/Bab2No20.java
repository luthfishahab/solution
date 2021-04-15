package folder1;

import java.util.Scanner;

public class Bab2No20 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan saldo dan suku bunga : ");
        double saldo = bacaInput.nextDouble();
        double suku_bunga = bacaInput.nextDouble();
        
        double bunga = saldo * (suku_bunga/1200);
        
        System.out.println("Bunga bulan pertama adalah " + bunga);
    }
    
}