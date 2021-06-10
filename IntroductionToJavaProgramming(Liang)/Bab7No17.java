package folder1;

import java.util.Scanner;

public class Bab7No17 {

    public static void main(String[] args) {
        
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan banyak siswa : ");
        
        int n = bacaInput.nextInt();
        
        String[] nama = new String[n];
        int[] nilai = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama : ");
            nama[i] = bacaInput.next();
            
            System.out.print("Masukkan nilai : ");
            nilai[i] = bacaInput.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + "\t\t" + nilai[i]);
        }
        
        
        //String[] nama = {"Andin", "Budi", "Chaca", "Dono", "Elsa"};
        //int[] nilai =   {99,      80,     75,      85,     90};
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i] + "\t" + nama[i]);
        }
        
        System.out.println();
        
        sortStudent(nama, nilai);
    }
    
    public static void sortStudent(String[] nama, int[] nilai) {
        for (int i = 1; i < nilai.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nilai[j+1] > nilai[j]) {
                    int temp1 = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = temp1;
                    
                    String temp2 = nama[j];
                    nama[j] = nama[j+1];
                    nama[j+1] = temp2;
                }
            }
        }
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i] + "\t" + nama[i]);
        }
    }
}