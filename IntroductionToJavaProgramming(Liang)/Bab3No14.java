package folder1;

import java.util.Scanner;

public class Bab3No14 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Pilih \"Gambar\" atau \"Angka\" : ");
        String pilihan_user = bacaInput.nextLine();
        
        double b = Math.random();
        
        String yang_muncul = "";
        if (b < 0.5) {
            yang_muncul = "Gambar";
        }
        else {
            yang_muncul = "Angka";
        }
        
        if (pilihan_user.equals(yang_muncul)) {
            System.out.println("Yang muncul adalah " + yang_muncul);
            System.out.println("Tebakannya benar");
        }
        else {
            System.out.println("Yang muncul adalah " + yang_muncul);
            System.out.println("Tebakannya salah");
        }
        
    }
    
}