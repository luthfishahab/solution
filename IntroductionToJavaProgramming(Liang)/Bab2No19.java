package folder1;

import java.util.Scanner;

public class Bab2No19 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan tiga titik segitiga : ");
        double x1 = bacaInput.nextDouble();
        double y1 = bacaInput.nextDouble();
        double x2 = bacaInput.nextDouble();
        double y2 = bacaInput.nextDouble();
        double x3 = bacaInput.nextDouble();
        double y3 = bacaInput.nextDouble();
        
        double sisi1 = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        sisi1 = Math.sqrt(sisi1);
        
        double sisi2 = Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2);
        sisi2 = Math.sqrt(sisi2);
        
        double sisi3 = Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2);
        sisi3 = Math.sqrt(sisi3);
        
        double s = (sisi1 + sisi2 + sisi3) / 2;
        
        double luas = Math.sqrt(s * (s-sisi1) * (s-sisi2) * (s-sisi3));
        
        System.out.println("Luas segitiga adalah " + luas);
        
        
        
        
    }
    
}