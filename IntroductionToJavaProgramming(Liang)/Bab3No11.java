package folder1;

import java.util.Scanner;

public class Bab3No11 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan bulan : ");
        int a = bacaInput.nextInt();
        
        System.out.print("Masukkan tahun : ");
        int b = bacaInput.nextInt();
        
        // 28 atau 29 = Februari (2)
        // 30 = April (4), Juni (6), September (9), November (11)
        // 31 = Januari (1), Maret (3), Mei (5), Juli (7), Agustus (8), Oktober (10), Desember (12)
        int jumlah_hari = 0;
        if (a == 2) {
            jumlah_hari = 28;
            if (b%4 == 0) {
                jumlah_hari = 29;
            }
        }
        else if (a == 4 || a == 6 || a == 9 || a == 11) {
            jumlah_hari = 30;
        }
        else {
            jumlah_hari = 31;
        }
        
        String bulan = "";
        if(a == 1) {
            bulan = "Januari";
        }
        else if(a == 2) {
            bulan = "Februari";
        }
        else if(a == 3) {
            bulan = "Maret";
        }
        else if(a == 4) {
            bulan = "April";
        }
        else if(a == 5) {
            bulan = "Mei";
        }
        else if(a == 6) {
            bulan = "Juni";
        }
        else if(a == 7) {
            bulan = "Juli";
        }
        else if(a == 8) {
            bulan = "Agustus";
        }
        else if(a == 9) {
            bulan = "September";
        }
        else if(a == 10) {
            bulan = "Oktober";
        }
        else if(a == 11) {
            bulan = "November";
        }
        else if(a == 12) {
            bulan = "Desember";
        }
        
        System.out.println(bulan + " " + b + " terdiri dari " + jumlah_hari + " hari");
    }
    
}
