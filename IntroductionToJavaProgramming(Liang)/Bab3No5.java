package folder1;

import java.util.Scanner;

public class Bab3No5 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukkan hari ini : ");
        
        int a = bacaInput.nextInt();
        
        System.out.print("Masukkan berapa hari berikutnya : ");
        
        int b = bacaInput.nextInt();
        
        a = a % 7;
        
        String hari_ini = "";
        if(a == 0) {
            hari_ini = "Minggu";
        }
        else if(a == 1) {
            hari_ini = "Senin";
        }
        else if(a == 2) {
            hari_ini = "Selasa";
        }
        else if(a == 3) {
            hari_ini = "Rabu";
        }
        else if(a == 4) {
            hari_ini = "Kamis";
        }
        else if(a == 5) {
            hari_ini = "Jumat";
        }
        else if(a == 6) {
            hari_ini = "Sabtu";
        }
        
        int c = a + b;
        int d = c % 7;
        
        String hari_berikutnya = "";
        if(d == 0) {
            hari_berikutnya = "Minggu";
        }
        else if(d == 1) {
            hari_berikutnya = "Senin";
        }
        else if(d == 2) {
            hari_berikutnya = "Selasa";
        }
        else if(d == 3) {
            hari_berikutnya = "Rabu";
        }
        else if(d == 4) {
            hari_berikutnya = "Kamis";
        }
        else if(d == 5) {
            hari_berikutnya = "Jumat";
        }
        else if(d == 6) {
            hari_berikutnya = "Sabtu";
        }
        
        System.out.println("Hari ini adalah hari " + hari_ini + " dan hari berikutnya adalah " + hari_berikutnya);
    }
    
}
