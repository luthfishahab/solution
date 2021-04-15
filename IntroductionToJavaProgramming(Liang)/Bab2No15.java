package folder1;

import java.util.Scanner;

public class Bab2No15 {

    public static void main(String[] args) {
        
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan x1 dan y1 : ");
        
        double x1 = bacaInput.nextDouble();
        double y1 = bacaInput.nextDouble();
        
        System.out.print("Masukkan x2 dan y2 : ");
        
        double x2 = bacaInput.nextDouble();
        double y2 = bacaInput.nextDouble();
        
        double a = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double b = Math.sqrt(a);
        
        System.out.println("Jarak antara dua titik tersebut adalah " + b);
        
        
        
    }
    
}