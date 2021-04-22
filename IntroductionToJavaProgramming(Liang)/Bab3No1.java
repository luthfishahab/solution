package folder1;

import java.util.Scanner;

public class Bab3No1 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukkan a, b, c : ");
        
        double a = bacaInput.nextDouble();
        double b = bacaInput.nextDouble();
        double c = bacaInput.nextDouble();
        
        // D is discriminant
        double D = b*b - 4*a*c;
        
        if (D > 0) {
            // ada dua akar
            double r1 = (- b + Math.sqrt(D)) / (2*a);
            double r2 = (- b - Math.sqrt(D)) / (2*a);
            System.out.println("Persamaan tersebut mempunyai dua akar, yaitu " + r1 + " dan " + r2);
        }
        else if (D == 0) {
            // ada satu akar
            double r1 = (- b) / (2*a);
            System.out.println("Persamaan tersebut mempunyai satu akar, yaitu " + r1);
        }
        else {
            // tidak punya akar
            System.out.println("Persamaan tersebut tidak mempunyai akar riil");
        }
    }
}