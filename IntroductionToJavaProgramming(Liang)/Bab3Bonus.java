package folder1;

import java.util.Scanner;

public class Bab3Bonus {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka (0-100) : ");
        double nilai_angka = bacaInput.nextDouble();
        
        String nilai_huruf = "";
        if (nilai_angka >= 0 && nilai_angka <= 100) {
            if (nilai_angka >= 86) {
                nilai_huruf = "A";
            }
            else if (nilai_angka >= 76) {
                nilai_huruf = "AB";
            }
            else if (nilai_angka >= 66) {
                nilai_huruf = "B";
            }
            else if (nilai_angka >= 61) {
                nilai_huruf = "BC";
            }
            else if (nilai_angka >= 56) {
                nilai_huruf = "C";
            }
            else if (nilai_angka >= 41) {
                nilai_huruf = "D";
            }
            else if (nilai_angka >= 0) {
                nilai_huruf = "E";
            }
            System.out.println("Nilai huruf nya adalah " + nilai_huruf);
        }
        else {
            System.out.println("Nilai yang dimasukkan tidak berada pada rentang 0-100");
        }
        
    }
    
}
